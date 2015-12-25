package com.jw.service;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.multipart.MultipartFile;

import com.jw.bean.Role;
import com.jw.bean.RoleExample;
import com.jw.bean.Student;
import com.jw.bean.StudentExample;
import com.jw.utils.PageBean;

public interface IStudentService {
	int addStudent(Student stu);
	int deleteById(int id);
	int updateStudent(Student stu);
	List<Student> getStudentByExample(StudentExample example);
	PageBean<Student> getScrollData(StudentExample example, int start, int end);
	Student getByid(int id);
    void importFile(MultipartFile file) throws Exception;
    void exportExcel(HttpServletRequest req, HttpServletResponse resp) throws IOException;
}
