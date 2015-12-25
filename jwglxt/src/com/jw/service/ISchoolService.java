package com.jw.service;

import java.util.List;

import com.jw.bean.School;
import com.jw.bean.SchoolExample;
import com.jw.utils.PageBean;

public interface ISchoolService {
	int addSchool(School school);
	int deleteById(int id);
	int updateSchool(School school);
	List<School>getSchoolByExample(SchoolExample example);
	PageBean<School> getScrollData(SchoolExample example, int start, int end);
	School getById(int id);


}
