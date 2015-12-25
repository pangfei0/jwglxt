package com.jw.common;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.springframework.web.context.ContextLoaderListener;

import javax.servlet.ServletContextEvent;
import java.io.File;
import java.util.List;

/**
 * Created by Pang fei on 2015/11/7.
 */
public class UploadTask extends ContextLoaderListener {

   /* *//**
     * 每天的毫秒数
     *//*
    public static final long PERIOD_DAY = DateUtils.MILLIS_IN_DAY;
    *//**
     * 一周内的毫秒数
     *//*
    public static final long PERIOD_WEEK = PERIOD_DAY * 7;
    *//**
     * 无延迟
     *//*
    public static final long NO_DELAY = 0;
    *//**
     * 定时器
     *//*
    private Timer timer;*/
    /**
     * 在Web应用启动时初始化任务 读取moviebarid 和 Json临时存放文件
     */
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        String moviebarid="";
        SAXReader xmlReader = new SAXReader();
        String jsonpath = servletContextEvent.getServletContext().getRealPath("/uploadJsonDate/");
        String tomcatpath=System.getProperty("user.dir");
        //影吧配置文件位置
        String moviexmlpath = tomcatpath.substring(0,tomcatpath.length()-3)+"movieConfig\\moviebarxml\\moviebar.xml";
        Document doc = null; //读取xml配置文件
        try {

            doc = xmlReader.read(new File(moviexmlpath));

        } catch (DocumentException e) {
            e.printStackTrace();
        }
        Element root = doc.getRootElement(); //获取根节点
        List<Element> elements = root.elements();  //获取根节点下的所有子节点
        for (Element element : elements) { //遍历子节点
            if (element.getName() == "barid") {
                servletContextEvent.getServletContext().setInitParameter("moviebarid",(String) element.getData());
            }
            if(element.getName() == "issetup")
            {
                servletContextEvent.getServletContext().setAttribute("issetup",(String) element.getData());
            }
            if(element.getName() == "name")
            {
                servletContextEvent.getServletContext().setInitParameter("moviebarname",(String) element.getData());
            }
        }
        servletContextEvent.getServletContext().setInitParameter("uploadjsonpath",jsonpath);
        servletContextEvent.getServletContext().setInitParameter("moviexmlpath",moviexmlpath);
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
