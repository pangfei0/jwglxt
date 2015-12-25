package com.jw.service;

import java.util.List;

import com.jw.bean.Grade;
import com.jw.bean.GradeExample;
import com.jw.bean.Role;
import com.jw.bean.RoleExample;
import com.jw.utils.PageBean;

public interface IRoleService {
	int addRole(Role role);
	int deleteById(int id);
	int updateRole(Role role);
	List<Role> getRoleByExample(RoleExample example);
	PageBean<Role> getScrollData(RoleExample example, int start, int end);
	Role getByid(int id);

}
