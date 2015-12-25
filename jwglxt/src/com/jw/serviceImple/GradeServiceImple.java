package com.jw.serviceImple;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.jw.bean.Grade;
import com.jw.bean.GradeExample;
import com.jw.dao.GradeMapper;
import com.jw.service.IGradeService;
import com.jw.utils.PageBean;

@Service("gradeService")
public class GradeServiceImple implements IGradeService {
	@Resource
	private GradeMapper dao;

	@Override
	public int addGrade(Grade grade) {
		// TODO Auto-generated method stub
		return dao.insert(grade);
	}

	@Override
	public int deleteById(int id) {
		// TODO Auto-generated method stub
		return dao.deleteByPrimaryKey(id);
	}

	@Override
	public int updateGrade(Grade grade) {
		// TODO Auto-generated method stub
		return dao.updateByPrimaryKeySelective(grade);
	}

	@Override
	public List<Grade> getRoleByExample(GradeExample example) {
		// TODO Auto-generated method stub
		return dao.selectByExample(example);
	}
	@Override
    public PageBean<Grade> getScrollData(GradeExample example, int start, int end) {
        PageHelper.startPage(start, end);
        List<Grade>  list=this.dao.selectByExample(example);
        return new PageBean<Grade>(list);
    }

	@Override
	public Grade getGradeByid(int id) {
		// TODO Auto-generated method stub
		return dao.selectByPrimaryKey(id);
	}

}
