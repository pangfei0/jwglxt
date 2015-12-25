package com.jw.serviceImple;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.jw.bean.Grade;
import com.jw.bean.GradeExample;
import com.jw.bean.Role;
import com.jw.bean.RoleExample;
import com.jw.bean.User;
import com.jw.dao.RoleMapper;
import com.jw.service.IRoleService;
import com.jw.utils.PageBean;
@Service("roleService")
public class RoleServiceImple implements IRoleService{

	@Resource
	private RoleMapper dao;
	@Override
	public int addRole(Role record) {
		// TODO Auto-generated method stub
		return dao.insert(record);
	}
	@Override
	public int deleteById(int id) {
		// TODO Auto-generated method stub
		return dao.deleteByPrimaryKey(id);
	}
	@Override
	public int updateRole(Role record) {
		// TODO Auto-generated method stub
		return dao.updateByPrimaryKey(record);
	}
	@Override
	public List<Role> getRoleByExample(RoleExample example) {
		// TODO Auto-generated method stub
		return dao.selectByExample(example);
	}
	@Override
	public PageBean<Role> getScrollData(RoleExample example, int start,
			int end) {
		// TODO Auto-generated method stub
		    PageHelper.startPage(start, end);
	        List<Role>  list=this.dao.selectByExample(example);
	        return new PageBean<Role>(list);
	}
	@Override
	public Role getByid(int id) {
		// TODO Auto-generated method stub
		return dao.selectByPrimaryKey(id);
	}



}
