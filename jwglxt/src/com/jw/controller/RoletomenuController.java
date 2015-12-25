package com.jw.controller;

import com.jw.bean.Roletomenu;
import com.jw.bean.RoletomenuExample;
import com.jw.common.JsonUtil;
import com.jw.common.ParamContext;
import com.jw.service.IMenuService;
import com.jw.service.IRoleService;
import com.jw.service.IRoletomenuService;
import com.jw.utils.PageBean;
import org.apache.log4j.Logger;
import org.apache.log4j.MDC;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Created by Pang fei on 2015/8/25.
 */

@Controller
public class RoletomenuController {
    public static Logger logger = Logger.getLogger(RoletomenuController.class);
    private ParamContext beforeParm=new ParamContext();
    @Resource
    private IRoletomenuService roletomenuService=null;

    @Resource
    private IRoleService roleService=null;
    @Resource
    private IMenuService menuService=null;

    /**
     * 跳转RoletoMenu管理界面
     * @return
     */

        @RequestMapping(value="/roleprivilegeManage")
    public ModelAndView roletoMenuManage() {
        Map<String, Object> paramMap = new HashMap<String, Object>();

                paramMap.put("tv", JsonUtil.RandName());
        //MDC.put("optusername","liding");
                //logger.error("test");
                        return new ModelAndView("home/roleprivilegemanage", paramMap);
    }

    /**
     * datagrid 初始化信息
     * @param example
     * @return
     */

        @RequestMapping("/getRoletomenuList")
    @ResponseBody
    public List<Roletomenu> getRoletoMenuList(RoletomenuExample example)
    {
        PageBean<Roletomenu> roletoMenulist=roletomenuService.getScrollData(null,1,9999);
        return roletoMenulist.getList();
    }
    @RequestMapping("/getRoletoMenus")
    @ResponseBody
    public  Map<String, Object> getRoletoMenus(String method,String valone,String valtwo,Integer rows,Integer page)
    {
        Map<String, Object> paramMap = new HashMap<String, Object>();
        RoletomenuExample RoletoMenuExample = new RoletomenuExample();
        if (null == page || page < 0)
                page = 1;
        if (null == rows || rows < 0)
                rows = 15;

                int start = page;
        int end = rows;

                if (method == null || method.trim().isEmpty()||valone.trim().equals("")){
                RoletoMenuExample.setOrderByClause(" roleid desc");
            }else{
                if(method.trim().equals("name") || method.trim() == "name")
                    {
                                RoletoMenuExample.or().andRoleidEqualTo(valone);
                }
                if(method.trim().equals("owner") || method.trim() == "owner"){
                        RoletoMenuExample.or().andMenuidEqualTo(valone);
                    }
            }

                try {
                PageBean<Roletomenu>  RoletoMenuList = roletomenuService.getScrollData(RoletoMenuExample,start,end);
                paramMap.put("total",RoletoMenuList.getTotal());
                paramMap.put("rows",RoletoMenuList.getList());
            } catch (Exception ex) {
                logger.error(ex.getMessage());
            }

                return paramMap;
    }
    @RequestMapping(value="/addRoletomenu")
    public ModelAndView addRoletomenu(String roleid,String menuids,HttpSession session)
    {
        String Result = "Failed";
        String Message = "";
        String menuidList[]=menuids.split(",");
        Map<String, Object> paramMap = new HashMap<String, Object>();
        try{
            //先删除已有菜单
        	RoletomenuExample example=new RoletomenuExample();
            example.or().andRoleidEqualTo(roleid);
            roletomenuService.deleteByExample(example);

            for(String i:menuidList)
            {
            	Roletomenu roletoMenu=new Roletomenu();
                roletoMenu.setRoleid(roleid);
                roletoMenu.setMenuid(i);
                int result=this.roletomenuService.insert(roletoMenu);
                if(result!=1)
                {
                    Message=roleid+"--"+i+"添加失败";

                }
            }
            if(Message=="")
            {
                Message="添加成功！";
            }

        }
        catch (Exception e)
        {
            Result="error";
            Message=e.getMessage();
            logger.error(Message);
        }



        paramMap.put("Message", Message);
        paramMap.put("Result", Result);
        if(session.getAttribute("username") != null && !session.getAttribute("username").equals("")){
            MDC.put("optusername", session.getAttribute("username"));
            logger.error("角色菜单管理"+roleid);
        }

        return new ModelAndView("common/messageDone", paramMap);
    }

    @RequestMapping(value="/deleteRoletoMenu")
    public ModelAndView deleteRoletoMenu(Integer roleid,String menuids,HttpSession session) {
        String Result = "Failed";
        String Message = "";
        List<String> menuList=new ArrayList<String>();
        for(String i:menuids.split(","))
          menuList.add(i);
        Map<String, Object> paramMap = new HashMap<String, Object>();
        if (roleid == null ||roleid.equals("")) {
                Message = "";
            } else {
                try {
                	RoletomenuExample example=new RoletomenuExample();
                    example.or().andMenuidIn(menuList);
                    this.roletomenuService.deleteByExample(example);
                        paramMap.put("urlocation", "getRoletoMenus.do");
                        paramMap.put("tagret", "影吧信息管理");

                    } catch (Exception e) {
                        Result = "error";
                        Message = e.getMessage();
                        logger.error(Message);
                    }
                 Result="Success";
                 Message="移除成功！";
                    }
        paramMap.put("Message", Message);
        paramMap.put("Result", Result);
        if (session.getAttribute("username") != null && !session.getAttribute("username").equals("")) {
                MDC.put("optusername", session.getAttribute("username"));
                logger.error("影吧信息管理"+ roleid);
            }

                return new ModelAndView("common/messageDone", paramMap);
    }
    /**
     * 修改角色菜单信息Dialog
     * @return
     */
    @RequestMapping(value="/roletomenuDetail")
    public String  rolemenutoDetail(Model model,@RequestParam("tv")String tv)
    {
    /*  List<Role> roleList=roleService.*/
        model.addAttribute("tv", tv);
        return  "/dialog/roletomenuDetail";
    }


}

