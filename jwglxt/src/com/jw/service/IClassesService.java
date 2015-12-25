package com.jw.service;

import java.util.List;

import com.jw.bean.Classes;
import com.jw.bean.ClassesExample;
import com.jw.utils.PageBean;

public interface IClassesService {
	int addClasses(Classes classes);
	int deleteById(int id);
	int updateClasses(Classes classes);
	List<Classes>getClassesByExample(ClassesExample example);
	PageBean<Classes> getScrollData(ClassesExample example, int start, int end);
	Classes getById(int id);


}
