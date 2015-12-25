package com.jw.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.jw.bean.User;
import com.jw.bean.UserExample;
import com.jw.common.JsonUtil;
import com.jw.identity.Validator;
import com.jw.service.IUserService;
import com.jw.serviceImple.UserServiceImple;
import com.jw.utils.PageBean;
@Controller
public class UserController extends BaseController {
	    public static Logger logger = Logger.getLogger(UserController.class);

	    private com.jw.common.Md5 md5 = new com.jw.common.Md5();

	    @Resource
	    private IUserService userService;

	    private Map<String, Object> paramMap = new HashMap<String, Object>();


	    /**
	     * 管理界面
	     *
	     * @return
	     */
	    @RequestMapping(value = "/userManage")
	    public String userManage(Model model) {
	        model.addAttribute("tv",JsonUtil.RandName());
	        return  "home/usermanage";
	    }

	    /**
	     * 得到用户列表
	     *
	     * @return
	     */
	    @RequestMapping(value = "/getUserList")
	    @ResponseBody
	    public List<User> getUserList() {
	        PageBean<User> userList = userService.getScrollData(null, 1, Integer.MAX_VALUE);
	        return userList.getList();
	    }

	    /**
	     * 得到用户信息
	     *
	     * @param method
	     * @param valone
	     * @param rows
	     * @param page
	     * @return
	     */
	    @RequestMapping(value = "/getUser")
	    @ResponseBody
	    public Map<String, Object> getUser(String method, String valone, Integer rows, Integer page) {
	        UserExample userExample = new UserExample();
	        if (null == page || page < 0)
	            page = 1;
	        if (null == rows || rows < 0)
	            rows = 15;
	        int start = page;
	        int end = rows;
	        if (method == null || method.trim().isEmpty()||valone.trim().equals("")) {
	            userExample.setOrderByClause(" id desc");
	        } 
	        else if (method.trim().equals("username") || method.trim() == "username") {
	                userExample.or().andUnameLike("%" + valone + "%");
	            }
	        PageBean<User> userList = userService.getScrollData(userExample, start, end);
	        paramMap.put("total", userList.getTotal());
	        paramMap.put("rows", userList.getList());
	        return paramMap;
	    }

	    /**
	     * 修改密码
	     *
	     * @param user
	     * @return
	     */
	    @RequestMapping(value = "/editPWD")
	    public ModelAndView editPWD(User user) {
	        String pwd = user.getUpwd();
	        if (null == user||null == pwd) {
	            return ajaxDoneError("用户对象为空。", paramMap);
	        } else {
	            user = userService.getUserByUserID(user.getId());
	            user.setUpwd(md5.getMD5ofStr(pwd));
	            if (userService.updateByPrimaryKey(user) != 1) {
	                return ajaxDoneError("修改密码失败。", paramMap);
	            } else {
	                logger.error("修改密码" + user.getUname() + ",userid:" + user.getId());
	                return ajaxDoneSuccess("修改密码成功。", paramMap);
	            }
	        }
	    }

	    /**
	     * 添加用户
	     *
	     * @param user
	     * @return
	     */
	    @RequestMapping(value = "/addUser")
	    public ModelAndView addUser(User user) {
	        if (null == user) {
	            return messageDoneError("用户对象为空。", paramMap);
	        }
	        else if (null!=userService.getUserByUsername(user.getUname())){
	            return messageDoneError("用户创建失败,用户名重复:"+user.getUname()+"。", paramMap);
	        }
	        else {
	            //初始密码为空
	            user.setUpwd(md5.getMD5ofStr("000000"));
	            if (userService.insert(user) != 1) {
	                return messageDoneError("用户创建失败。", paramMap);
	            } else {
	                logger.error("增加用户" + user.getUname() + ",userid:" + user.getId());
	                return messageDoneSuccess("用户创建成功，默认密码是000000，请修改密码。", paramMap);
	            }
	        }
	    }


	    /**
	     * 编辑用户
	     *
	     * @param user
	     * @return
	     */
	    @RequestMapping(value = "/editUser")
	    public ModelAndView editUser(User user,HttpSession session) {
	        String pwd = userService.getUserByUserID(user.getId()).getUpwd();
	        /*int init=userService.getUserByUserID(user.getUserid()).getInit();*/
	        user.setUpwd(pwd);
	        /*user.setInit(init);*/
	        if (null == user) {
	            return messageDoneError("用户对象为空。", paramMap);
	        }
	        if(!Validator.getInstance().init(session).validate()){
	            return messageDoneError("回话超时，请重新登录。", paramMap);
	        }
	        if (userService.updateByPrimaryKey(user) != 1) {
	            return messageDoneError("用户修改失败。", paramMap);
	        } else {
	            logger.error("修改用户" + user.getUname() + ",userid:" + user.getId());
	            return messageDoneSuccess("用户修改成功。", paramMap);
	        }
	    }

	    /**
	     * 删除用户
	     *
	     * @param userid
	     * @return
	     */
	    @RequestMapping(value = "/deleteUser")
	    public ModelAndView deleteUser(Integer id,HttpSession session) {
	        if(!Validator.getInstance().init(session).validate()){
	            return messageDoneError("回话超时，请重新登录。", paramMap);
	        }
	        if (null == id || id.equals("")) {
	            return messageDoneError("用户编号为空。", paramMap);
	        }
	        if (userService.deleteByPrimaryKey(id) != 1) {
	            return messageDoneError("用户删除失败。", paramMap);
	        } else {
	            logger.error("删除用户" + ",userid:" + id);
	            return messageDoneSuccess("用户删除成功。", paramMap);
	        }
	    }

	}
