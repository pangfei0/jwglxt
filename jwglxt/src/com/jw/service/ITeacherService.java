package com.jw.service;

import java.util.List;

import com.jw.bean.Teacher;
import com.jw.bean.TeacherExample;
import com.jw.utils.PageBean;

public interface ITeacherService {
	int addTeacher(Teacher teacher);
	int deleteById(int id);
	int updateTeacher(Teacher teacher);
	List<Teacher>getTeacherByExample(TeacherExample example);
	PageBean<Teacher> getScrollData(TeacherExample example, int start, int end);
	Teacher getById(int id);


}
