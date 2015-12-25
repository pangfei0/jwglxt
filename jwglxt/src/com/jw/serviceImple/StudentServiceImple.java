package com.jw.serviceImple;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.formula.functions.Match;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageHelper;
import com.jw.bean.Grade;
import com.jw.bean.Student;
import com.jw.bean.StudentExample;
import com.jw.dao.StudentMapper;
import com.jw.service.IStudentService;
import com.jw.utils.PageBean;
@Service("stuService")
public class StudentServiceImple implements IStudentService{
	@Resource
	StudentMapper dao;

	@Override
	public int addStudent(Student stu) {
		// TODO Auto-generated method stub
		
		return dao.insert(stu);
	}

	@Override
	public int deleteById(int id) {
		// TODO Auto-generated method stub
		return dao.deleteByPrimaryKey(id);
	}

	@Override
	public int updateStudent(Student stu) {
		// TODO Auto-generated method stub
		return dao.updateByPrimaryKey(stu);
	}

	@Override
	public List<Student> getStudentByExample(StudentExample example) {
		// TODO Auto-generated method stub
		return dao.selectByExample(example);
	}

	@Override
	public PageBean<Student> getScrollData(StudentExample example, int start,
			int end) {
		// TODO Auto-generated method stub
		PageHelper.startPage(start, end);
        List<Student>  list=this.dao.selectByExample(example);
        return new PageBean<Student>(list);
	}

	@Override
	public Student getByid(int id) {
		// TODO Auto-generated method stub
		return dao.selectByPrimaryKey(id);
	}

	@Override
	@RequestMapping(value="/stuImport")
    public void importFile(MultipartFile file) throws Exception {
        InputStream in = file.getInputStream();
        //读取工作薄
        Workbook workbook = null;
        if (file.getOriginalFilename().endsWith(".xls")) {
            workbook = new HSSFWorkbook(in);
        } else
            workbook = new XSSFWorkbook(in);
        //读取工作表
        Sheet sheet = workbook.getSheetAt(0);
        //读取行
        if (sheet.getPhysicalNumberOfRows() > 1) {
            for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
/*                Student stu = new Student();
                Row row = sheet.getRow(i);
                Cell cell1 = row.getCell(1);//第二列
                //通过mac地址判断盒子是否存在
               StudentExample example = new StudentExample();
               example.or().andBoxmacEqualTo(cell1.getStringCellValue());
                List<Playbox> playboxList = boxdao.selectByExample(playboxExample);
                if (playboxList.size() != 0) {
                    continue;
                } else {
                    //读取列
                    Cell cell0 = row.getCell(0);
                    playbox.setBoxname(cell0.getStringCellValue());//盒子名称
                    playbox.setBoxmac(cell1.getStringCellValue());//MAC地址
                    Cell cell2 = row.getCell(2);
                    playbox.setStatus((int) cell2.getNumericCellValue());//盒子状态
                    Cell cell3 = row.getCell(3);
                    playbox.setBoxip(cell3.getStringCellValue());//盒子ip
                    Cell cell4 = row.getCell(4);
                    playbox.setRemark(cell4.getStringCellValue());//备注
                    boxdao.insert(playbox);*/
                }
            }
        }
   /*     workbook.close();
        in.close();*/
  /*  }*/
	
	@RequestMapping(value="/stuExport")
	public void exportExcel(HttpServletRequest req, HttpServletResponse resp) throws IOException{

	HSSFWorkbook wb = new HSSFWorkbook();
	req.setCharacterEncoding("UTF-8");
	resp.setCharacterEncoding("UTF-8");
	resp.setContentType("application/x-download");

	String filedisplay = "学生信息.xls";
	filedisplay = URLEncoder.encode(filedisplay, "UTF-8");
	resp.addHeader("Content-Disposition", "attachment;filename="+ filedisplay);
	HSSFSheet sheet = wb.createSheet("学生信息");
	sheet.setColumnWidth(0, 50*160);
	HSSFFont font = wb.createFont();
	font.setFontName("宋体");
	font.setFontHeightInPoints((short) 16);

	HSSFRow row = sheet.createRow((int) 0);

	HSSFCellStyle style = wb.createCellStyle();
	style.setAlignment(HSSFCellStyle.ALIGN_CENTER); 

	HSSFCell cell = row.createCell(0);
	cell.setCellValue("产品名称");

	Map<String, Object> params = new HashMap<String, Object>(); 
	try {
	OutputStream out = resp.getOutputStream();
	wb.write(out);
	out.close();
	}
	catch (Exception e) {
	e.printStackTrace();
	}
	}
}
