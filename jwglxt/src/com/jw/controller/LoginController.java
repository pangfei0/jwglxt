package com.jw.controller;


import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jw.bean.User;
import com.jw.bean.UserExample;
import com.jw.identity.Constants;
import com.jw.identity.SysUser;
import com.jw.service.IRoleService;
import com.jw.service.IUserService;
import com.jw.serviceImple.UserServiceImple;

@Controller
public class LoginController {
	@Resource
	private IRoleService roleService;
	@Resource
	private IUserService userService;
	private com.jw.common.Md5 md5 = new com.jw.common.Md5();
	@RequestMapping("/login")
	public String login()
	{
		return "login/login";
	}
	@RequestMapping("/checkLogin")
	@ResponseBody
	public HashMap<String, Object> checkLogin(HttpSession session ,String uname,String pwd,String roleid)
	{
		HashMap<String, Object> paramMap=new HashMap<String, Object>();
		UserExample example=new UserExample();
		String mpwd=md5.getMD5ofStr(pwd);
		example.or().andUnameEqualTo(uname).andUpwdEqualTo(mpwd);
		List<User> list=userService.getScrollData(example, 1, 1999).getList();
		if(list.size()>0)
		{
			User user=list.get(0);
			String rname=user.getRname();
			int rid=user.getRoleid();
			String rolename=roleService.getByid(rid).getRolename();
			if(rid==Integer.valueOf(roleid))
			{
				paramMap.put("result", true);
				paramMap.put("user", user);
				paramMap.put("roleid", rid);
				paramMap.put("rolename",rolename);
				session.setAttribute("rolename",rolename);
				session.setAttribute("rname", rname);
				session.setAttribute("uid", user.getId());
				session.setAttribute(Constants.AUTHENTICATION_KEY, new SysUser(user));
				session.setAttribute("roleid", user.getRoleid());
			}
			else
			{   paramMap.put("user", user);
				paramMap.put("result", false);
				paramMap.put("rolemessage", "角色错误。");
			}
			

			return paramMap;
		}
		else
		{
			paramMap.put("result", false);
			paramMap.put("message", "密码或用户名错误。");
			return paramMap;
		}
		
	}
    @RequestMapping(value = "/logOut")
    public String logOut(HttpSession session) {
        String loginPoint = (String) session.getAttribute("loginPoint");
        if (loginPoint != null && loginPoint.equals("sysLogin")) {

        }
        session.invalidate();

        return "login/login";
    }

}
