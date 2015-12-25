package com.jw.service;

import java.util.List;

import com.jw.bean.Department;
import com.jw.bean.DepartmentExample;
import com.jw.utils.PageBean;

public interface IDepartmentService {
	int addDepartment(Department department);
	int deleteById(int id);
	int updateDepartment(Department department);
	List<Department>getDepartmentByExample(DepartmentExample example);
	PageBean<Department> getScrollData(DepartmentExample example, int start, int end);
	Department getById(int id);


}
