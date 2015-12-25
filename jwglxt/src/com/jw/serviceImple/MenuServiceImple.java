package com.jw.serviceImple;

import com.github.pagehelper.PageHelper;
import com.jw.bean.Menu;
import com.jw.bean.MenuExample;
import com.jw.dao.MenuMapper;
import com.jw.service.IMenuService;
import com.jw.utils.PageBean;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.util.List;

/**
 * Created by wangpu on 2015/8/12.
 */
@Service("menuService")
public class MenuServiceImple implements IMenuService {

    @Resource
    private MenuMapper dao;

    @Override
    public List<Menu> selectByUserRoleid(String roleid) {
        List<Menu> list=dao.selectByRoleid(roleid);
        return list;
    }
    @Override
    public List<Menu> selectnoByUserRoleid(String roleid) {
        List<Menu> list= dao.selectnoByRoleid(roleid);
        return list;
    }
    @Override
    public List<Menu> selectMainmenu() {
        MenuExample example=new MenuExample();
        example.or().andMenuidBetween("9","1000");
       return  dao.selectByExample(example);
    }
    @Override
    public PageBean<Menu> getScrollData(MenuExample example, int start, int end) {
        PageHelper.startPage(start, end);
        List<Menu> list = this.dao.selectByExample(example);
        return new PageBean<Menu>(list);
    }

}
