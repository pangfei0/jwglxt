package com.jw.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.jw.bean.Grade;
import com.jw.bean.GradeExample;
import com.jw.common.JsonUtil;
import com.jw.service.IGradeService;
import com.jw.utils.PageBean;
/**
 * 
 * @author pangfei
 *
 */
@Controller
public class GradeController {
	public static Logger logger = Logger.getLogger(GradeController.class);
	@Resource
	private IGradeService gradeService;
	@RequestMapping("/gradeManage")
	public ModelAndView gradeManage()
	{
		 Map<String, Object> paramMap = new HashMap<String, Object>();
	     paramMap.put("tv", JsonUtil.RandName());
	     return new ModelAndView("home/grademanage", paramMap);
	}
	/**
	 * 添加一个年级
	 * @param grade
	 * @return
	 */
	@RequestMapping("/addGrade")
	public int addGrade(Grade grade)
	{
		return gradeService.addGrade(grade);
	}
	/**
	 * 删除一个年级
	 * @param id
	 * @return
	 */
	@RequestMapping("/deleteGrade")
	public int deleteById(int id)
	{
		return gradeService.deleteById(id);
	}
	/**
	 * 获取所有年级
	 * @param example
	 * @return
	 */
	@RequestMapping("/getAllGrades")
	public List<Grade> getAllGrades(GradeExample example)
	{
		return gradeService.getRoleByExample(example);
	}
	/**
	 * 分页获取年级
	 * @param valone
	 * @param valtwo
	 * @param numPerPage
	 * @param pageNum
	 * @param orderField
	 * @param orderDirection
	 * @return
	 */
	@RequestMapping("/getSomeGrades")
	@ResponseBody
	public  Map<String, Object> getActivitys(String valone,String valtwo,Integer numPerPage,Integer pageNum,String orderField,String orderDirection)
    {
        Map<String, Object> paramMap = new HashMap<String, Object>();
        GradeExample example = new GradeExample();
        if (null == pageNum || pageNum < 0)
        	pageNum = 1;
        if (null == numPerPage || numPerPage < 0)
        	numPerPage = 20;
        int start = pageNum;
        int end = numPerPage;
        try {
            PageBean<Grade>  gradeList = gradeService.getScrollData(example,start,end);
            paramMap.put("total",gradeList.getTotal());
            paramMap.put("rows",gradeList.getList());
        } catch (Exception ex) {
            logger.error(ex.getMessage());
        }

        return paramMap;
    }
    
	@RequestMapping("/gradeUpdateDialog")
    public ModelAndView gotoUpdateDialog(int id)
    {
    	 Map<String, Object> paramMap = new HashMap<String, Object>();
    	 Grade grade=gradeService.getGradeByid(id);
    	 paramMap.put("grade", grade);
    	 return new ModelAndView("dialog/gradeUpdate",paramMap);
    }

}
