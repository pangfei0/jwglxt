package com.jw.controller;

import com.jw.bean.Menu;
import com.jw.service.IMenuService;
import com.jw.utils.PageBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Pang fei on 2015/9/8.
 */
@Controller
public class MenuController {
    @Resource
    private IMenuService menuService = null;
    @RequestMapping(value="/getMenuList")
    @ResponseBody
    public List MenuList(HttpSession session, HttpServletRequest request) throws Exception{

        PageBean<Menu> cdist = menuService.getScrollData(null, 1, 9999);
        List menus=new ArrayList();
        menus=TranMensData(cdist.getList(),"",0);
        return menus;
    }
    @RequestMapping(value="/getMenuListByRoleid")
    @ResponseBody
    public List MenuListByRoleid(HttpSession session, HttpServletRequest request) throws Exception{

        String roleid = request.getParameter("roleid").toString();
        List<Menu> cdist = menuService.selectByUserRoleid(roleid);

        return cdist;
    }
    @RequestMapping(value="/getMenuListnoByRoleid")
    @ResponseBody
    public List MenuListnoByRoleid(HttpSession session, HttpServletRequest request) throws Exception{

        String roleid = request.getParameter("roleid").toString();
        List<Menu> cdist = menuService.selectnoByUserRoleid(roleid);

        return cdist;
    }
    @SuppressWarnings("unchecked")
    private List TranMensData(List<Menu> ps,String level,int ipos){
        List root=new ArrayList();
        for(int i=ipos;i<ps.size();i++){
            if(ps.get(i).getMenuid().startsWith(level)&&ps.get(i).getMenuid().length()==level.length()+2&&!ps.get(i).getMenuid().startsWith("-")){
                Map m=new HashMap();
                m.put("menuid", ps.get(i).getMenuid());
                m.put("menuname", ps.get(i).getMenuname());
                m.put("sortorder",ps.get(i).getSortorder());
                m.put("description",ps.get(i).getDescription());
                m.put("url", ps.get(i).getUrl());
                List ls=this.TranMensData(ps,ps.get(i).getMenuid(),i+1);
                if(ls!=null&&ls.size()>0){
                    m.put("children", ls);
                    //m.put("state", "closed");
                    m.put("url", "#");
                }
                if((ps.get(i).getUrl()!=null&&ps.get(i).getUrl().trim().length()>0)||(ls!=null&&ls.size()>0))
                    root.add(m);
            }
        }
        return root;
    }
}
