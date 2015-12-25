package com.jw.service;

import com.jw.bean.Menu;
import com.jw.bean.MenuExample;
import com.jw.utils.PageBean;

import java.util.List;

/**
 * Created by wangpu on 2015/8/12.
 */
public interface IMenuService {
    public List<Menu> selectByUserRoleid(String roleid);
    public List<Menu> selectnoByUserRoleid(String roleid);

    /**
     * 获取主菜单
     * @return
     */
    public List<Menu> selectMainmenu();
    public PageBean<Menu> getScrollData(MenuExample example,int start,int end);
}
