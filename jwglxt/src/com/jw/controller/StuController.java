package com.jw.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.jw.bean.Student;
import com.jw.bean.StudentExample;
import com.jw.common.JsonUtil;
import com.jw.identity.Validator;
import com.jw.service.IStudentService;
import com.jw.utils.PageBean;

@Controller
public class StuController extends BaseController {
	 public static Logger logger = Logger.getLogger(StuController.class);
	@Resource
	IStudentService studentService;
    private Map<String, Object> paramMap = new HashMap<String, Object>();
	 @RequestMapping(value = "/stuManage")
	public String StudentManage(Model model) {
	        model.addAttribute("tv",JsonUtil.RandName());
	        return  "home/studentmanage";
	    }
	 @RequestMapping(value = "/stuDetail")
	 public ModelAndView stuDetail(int id,String tv) {
		        Student stu=studentService.getByid(id);
		        paramMap.put("stu", stu);
		        paramMap.put("tv", tv);
		        return  new ModelAndView("detail/stuDetail",paramMap);
		    }
	 @RequestMapping(value = "/stuUpdateJsp")
	 public ModelAndView stuUpdateDetail(int id,String tv) {
	        Student stu=studentService.getByid(id);
	        paramMap.put("stu", stu);
	        paramMap.put("tv", tv);
	        return  new ModelAndView("dialog/stuUpdate",paramMap);
	    }
	 @RequestMapping(value = "/stuAddJsp")
	 public ModelAndView stuAddDetail(String tv) {
	        paramMap.put("tv", tv);
	        return  new ModelAndView("dialog/stuAdd",paramMap);
	    }
	 /**
	     * 得到学生列表
	     *
	     * @return
	     */
	    @RequestMapping(value = "/getStuList")
	    @ResponseBody
	    public List<Student> getStudentList() {
	        PageBean<Student> StudentList = studentService.getScrollData(null, 1, Integer.MAX_VALUE);
	        return StudentList.getList();
	    }

	    /**
	     * 得到用户信息
	     *
	     * @param method
	     * @param valone
	     * @param rows
	     * @param page
	     * @return
	     */
	    @RequestMapping(value = "/getStudent")
	    @ResponseBody
	    public Map<String, Object> getStudent(String method, String valone, Integer rows, Integer page) {
	        StudentExample StudentExample = new StudentExample();
	        if (null == page || page < 0)
	            page = 1;
	        if (null == rows || rows < 0)
	            rows = 15;
	        int start = page;
	        int end = rows;
	        PageBean<Student> StudentList = studentService.getScrollData(StudentExample, start, end);
	        paramMap.put("total", StudentList.getTotal());
	        paramMap.put("rows", StudentList.getList());
	        return paramMap;
	    }

	    /**
	     * 添加学生
	     *
	     * @param Student
	     * @return
	     */
	    @RequestMapping(value = "/addStudent")
	    public ModelAndView addStudent(Student stu) {
	        int result =studentService.addStudent(stu);
	        if (result == 1) {
	            return messageDoneSuccess("添加成功。", paramMap);
	        }
	        else {
	                return messageDoneError("添加失败。", paramMap);
	            }
	    }


	    /**
	     * 编辑学生
	     *
	     * @param Student
	     * @return
	     */
	    @RequestMapping(value = "/editStudent")
	    public ModelAndView editStudent(Student stu,HttpSession session) {
	        if (null == stu) {
	            return messageDoneError("学生对象为空。", paramMap);
	        }
	        if(!Validator.getInstance().init(session).validate()){
	            return messageDoneError("回话超时，请重新登录。", paramMap);
	        }
	        if (studentService.updateStudent(stu) != 1) {
	            return messageDoneError("学生修改失败。", paramMap);
	        } else {
	            logger.error("修改学生" + stu.getSname()+ ",Studentid:" + stu.getId());
	            return messageDoneSuccess("学生修改成功。", paramMap);
	        }
	    }

	    /**
	     * 删除学生
	     *
	     * @param Studentid
	     * @return
	     */
	    @RequestMapping(value = "/deleteStudent")
	    public ModelAndView deleteStudent(Integer id,HttpSession session) {
	        if(!Validator.getInstance().init(session).validate()){
	            return messageDoneError("回话超时，请重新登录。", paramMap);
	        }
	        if (null == id || id.equals("")) {
	            return messageDoneError("学生编号为空。", paramMap);
	        }
	        if (studentService.deleteById(id) != 1) {
	            return messageDoneError("学生删除失败。", paramMap);
	        } else {
	            logger.error("删除学生" + ",Studentid:" + id);
	            return messageDoneSuccess("学生删除成功。", paramMap);
	        }
	    }
	    @RequestMapping(value = "/importStuExcelFile")
	    @ResponseBody
	    public Map<String, Object> importStuExcelFile(MultipartFile playboxfile) throws Exception {
	        Map<String, Object> paramMap = new HashMap<String, Object>();
	        //获取excel文件
	        if (playboxfile != null) {
	            //判断是否是excel文件
	            if (playboxfile.getOriginalFilename().matches("^.+\\.(?i)((xls)|(xlsx))$")) {
	                studentService.importFile(playboxfile);
	                paramMap.put("Result","Success");
	                paramMap.put("Message", "导入文件成功");
	            } else
	                paramMap.put("Message", "请导入excel文件");
	        }
	        return paramMap ;
	    }
	    @RequestMapping(value = "/exportStuExcelFile")
	    @ResponseBody
	    public Map<String, Object> exportStuExcelFile(HttpServletRequest req, HttpServletResponse resp) throws Exception {
	        Map<String, Object> paramMap = new HashMap<String, Object>();
	        //获取excel文件
	     
	                studentService.exportExcel(req, resp);
	                paramMap.put("Result","Success");
	                paramMap.put("Message", "导出文件成功");
	        return paramMap ;
	    }

}
