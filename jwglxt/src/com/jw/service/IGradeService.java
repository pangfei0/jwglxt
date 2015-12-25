package com.jw.service;

import java.util.List;

import com.jw.bean.Grade;
import com.jw.bean.GradeExample;
import com.jw.utils.PageBean;


/**
 * 
 * @author pangfei
 *
 */

public interface IGradeService {

	int addGrade(Grade grade);
	int deleteById(int id);
	int updateGrade(Grade grade);
	List<Grade> getRoleByExample(GradeExample example);
	PageBean<Grade> getScrollData(GradeExample example, int start, int end);
	Grade getGradeByid(int id);

}
