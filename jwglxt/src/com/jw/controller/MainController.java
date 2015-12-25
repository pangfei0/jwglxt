package com.jw.controller;

import com.jw.bean.Menu;
import com.jw.service.IMenuService;
import com.jw.utils.PageBean;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wangpu on 2015/8/12.
 */
@Controller
@RequestMapping(value = "/management/")
public class MainController {
    @Resource
    private IMenuService menuService = null;

    @RequestMapping(value="/main")
    public ModelAndView index(HttpSession session){
        Map<String, Object> paramMap = new HashMap<String, Object>();
        return new ModelAndView("home/main",paramMap);
    }

    @RequestMapping(value="/leftMenu")
    @ResponseBody
    public List leftMenu(HttpSession session, HttpServletRequest request) throws Exception{

        String roleid = session.getAttribute("roleid").toString();
        List<Menu> cdist = menuService.selectByUserRoleid(roleid);

        List Menus=new ArrayList();
        Menus=TranMensData(cdist,"",0);

        return Menus;
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
    class Url{
        private String url;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

    }
    @RequestMapping(value="/getMenuList")
    @ResponseBody
    public List  MenuList(HttpSession session, HttpServletRequest request) throws Exception{

        PageBean<Menu> cdist = menuService.getScrollData(null, 1, 9999);

        return cdist.getList();
    }
    @SuppressWarnings("unchecked")
    private List TranMensData(List<Menu> ps,String level,int ipos){
        List root=new ArrayList();
        for(int i=ipos;i<ps.size();i++){
            if(ps.get(i).getMenuid().startsWith(level)&&ps.get(i).getMenuid().length()==level.length()+2&&!ps.get(i).getMenuid().startsWith("-")){
                Map m=new HashMap();
                m.put("id", ps.get(i).getMenuid());
                m.put("text", ps.get(i).getMenuname());

                Url url = new Url();
                url.setUrl(ps.get(i).getUrl()+".do"+"?menuname="+ps.get(i).getMenuname());
                m.put("attributes", url);
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
