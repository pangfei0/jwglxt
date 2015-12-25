package com.jw.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jw.bean.School;
import com.jw.common.JsonUtil;
import com.jw.service.ISchoolService;

public class SchoolController {
	@Resource
	private ISchoolService schoolService;
    
	
	@RequestMapping("/schoolManage")
	public ModelAndView schoolManage()
	{
        Map<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("tv", JsonUtil.RandName());
        return new ModelAndView("home/schoolmanage", paramMap);
	}
	@RequestMapping("/updateSchool")
	public int updateSchool(School sc)
	{
		return schoolService.updateSchool(sc);
	}
}
