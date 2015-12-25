package com.jw.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.apache.log4j.MDC;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.jw.bean.Role;
import com.jw.bean.RoleExample;
import com.jw.common.JsonUtil;
import com.jw.service.IRoleService;
import com.jw.utils.PageBean;

@Controller
public class RoleController {
	public static Logger logger = Logger.getLogger(RoleController.class);
	@Resource
	private IRoleService roleService;
	@RequestMapping("/roleManage")
	public ModelAndView roleManage()
	{
		 Map<String, Object> paramMap = new HashMap<String, Object>();
	     paramMap.put("tv", JsonUtil.RandName());
	     return new ModelAndView("home/rolemanage", paramMap);
	}
	@RequestMapping("/getAllRoles")
	@ResponseBody
	public List<Role> getAllRoles()
	{
		return roleService.getRoleByExample(null);
	}
	/**
	 * 获取角色信息
	 * @param method
	 * @param valone
	 * @param valtwo
	 * @param rows
	 * @param page
	 * @return
	 */
	    @RequestMapping(value="/getRole")
	    @ResponseBody
	    public Map<String, Object> GetRoles(String method, String valone, String valtwo, Integer rows, Integer page) {
	        Map<String, Object> paramMap = new HashMap<String, Object>();
	        RoleExample roleExample = new RoleExample();
	        if (null == page || page < 0)
	            page = 1;
	        if (null == rows || rows < 0)
	            rows = 15;

	        int start = page;
	        int end = rows;

	        if (method == null || method.trim().isEmpty()||valone.trim().equals("")){
	            roleExample.setOrderByClause(" roleid desc");
	        }else{
	            if(method.trim().equals("roleid") || method.trim() == "roleid")
	            {
	                roleExample.or().andRoleidEqualTo(Integer.parseInt(valone));
	            }
	            if(method.trim().equals("rolename") || method.trim() == "rolename")
	            {
	                roleExample.or().andRolenameEqualTo(valone );
	            }
	        }

	        try {
	            PageBean<Role>  roleList = roleService.getScrollData(roleExample, start, end);
	            paramMap.put("total", roleList.getTotal());
	            paramMap.put("rows", roleList.getList());
	        } catch (Exception ex) {
	            logger.error(ex.getMessage());
	        }
	        return paramMap;
	    }
	@RequestMapping("/addRole")
	@ResponseBody
	public ModelAndView addRole(HttpSession session,Role role)
	{
		String Result = "Failed";
	    String Message = "";
	    Map<String, Object> paramMap = new HashMap<String, Object>();
	    if (null == role || role.getRoleid() == null) {
	        Message = "角色对象为空";
	    } else {
	        try {
	            role.setInit(0);
	            int result = roleService.addRole(role);
	            paramMap.put("urlocation", "getRole.do");
	            paramMap.put("tagret", "创建角色");
	            if (result < 1) {
	                Message = "角色创建失败";
	            } else {
	                Result = "Success";
	                Message = "角色创建成功";
	            }
	        } catch (Exception e) {
	            Result = "Error";
	            Message = "添加失败,请查看角色编号是否唯一。";
	            logger.error(Message);
	        }
	    }
	    paramMap.put("Message", Message);
	    paramMap.put("Result", Result);

	    if(session.getAttribute("username") != null && !session.getAttribute("username").equals("")){
	        MDC.put("optusername", session.getAttribute("username"));
	        logger.error("增加角色"+role.getRolename());
	    }

	    return new ModelAndView("common/messageDone", paramMap);
	}
	 /**
     * 删除角色
     *@param roleid
     */
    @RequestMapping(value="/deleteRole")
    public ModelAndView deleteRole(Integer roleid, HttpSession session) {
        String Result = "Failed";
        String Message = "";
        Map<String, Object> paramMap = new HashMap<String, Object>();

        if (null == roleid || roleid.equals("")) {
            Message = "角色编号为空";
        } else {
            try {
                int result = roleService.deleteById(roleid);
                paramMap.put("urlocation", "getRole.do");
                paramMap.put("tagret", "角色管理");
                if (result != 1)
                    Message = "角色删除失败";
                else {
                    Result = "Success";
                    Message = "角色删除成功";
                }
            } catch (Exception e) {
                Result = "Error";
                Message = e.getMessage();
                logger.error(Message);
            }
        }
        paramMap.put("Message", Message);
        paramMap.put("Result", Result);

        if(null != session.getAttribute("username") && !session.getAttribute("username").equals("")){
            MDC.put("optusername",session.getAttribute("username"));
            logger.error("删除角色"+roleid);
        }

        return new ModelAndView("common/messageDone", paramMap);
    }
    /**
     * 编辑角色
     * @param role
     * @param session
     */
    @RequestMapping(value="/editRole")
    public ModelAndView editRole(Role role, HttpSession session) {
        String Result = "Failed";
        String Message = "";
        int init= roleService.getByid(role.getRoleid()).getInit();
        role.setInit(init);
        Map<String, Object> paramMap = new HashMap<String, Object>();
        if (null == role || role.getRoleid() == null) {
            Message = "角色对象为空";
        } else {
            try {
                int result = roleService.updateRole(role);
                paramMap.put("urlocation", "editRole.do");
                paramMap.put("tagret", "修改角色");
                if (result < 1) {
                    Message = "角色修改失败";
                } else {
                    Result = "Success";
                    Message = "角色修改成功";
                }
            } catch (Exception e) {
                Result = "Error";
                Message = e.getMessage();
                logger.error(Message);
            }
        }
        paramMap.put("Message", Message);
        paramMap.put("Result", Result);

        if(null != session.getAttribute("username") && !session.getAttribute("username").equals("")){
            MDC.put("optusername", session.getAttribute("username"));
            logger.error("修改角色"+role.getRolename());
        }

        return new ModelAndView("common/messageDone", paramMap);
    }


}
