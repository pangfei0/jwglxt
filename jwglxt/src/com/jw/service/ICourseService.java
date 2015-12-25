package com.jw.service;

import java.util.List;

import com.jw.bean.Course;
import com.jw.bean.CourseExample;
import com.jw.utils.PageBean;

public interface ICourseService {
	int addCourse(Course course);
	int deleteById(int id);
	int updateCourse(Course course);
	List<Course>getCourseByExample(CourseExample example);
	PageBean<Course> getScrollData(CourseExample example, int start, int end);
	Course getById(int id);


}
