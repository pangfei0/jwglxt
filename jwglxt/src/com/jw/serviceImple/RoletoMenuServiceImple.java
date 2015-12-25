package com.jw.serviceImple;

import com.github.pagehelper.PageHelper;
import com.jw.dao.RoletomenuMapper;
import com.jw.bean.Roletomenu;
import com.jw.bean.RoletomenuExample;
import com.jw.bean.RoletomenuKey;
import com.jw.dao.RoletomenuMapper;
import com.jw.service.IRoletomenuService;
import com.jw.utils.PageBean;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.util.List;

/*
 * Created by Pang fei on 2015/8/25.
 */

@Service("roletomenuService")
public class RoletoMenuServiceImple implements IRoletomenuService{
    @Resource
    private RoletomenuMapper dao;
    public List<Roletomenu> selectByExample(RoletomenuExample example) {
        return dao.selectByExample(example);
    }

    public PageBean<Roletomenu> getScrollData(RoletomenuExample example, int start, int end) {
        PageHelper.startPage(start, end);
        List<Roletomenu>  list=this.dao.selectByExample(example);
        return new PageBean<Roletomenu>(list);
    }

    public int insert(Roletomenu Roletomenu) {
        return dao.insert(Roletomenu);
    }

    public int updateByPrimaryKey(Roletomenu Roletomenu) {
        return dao.updateByPrimaryKey(Roletomenu);
    }

    public int deleteByPrimaryKey(RoletomenuKey key) {
        return dao.deleteByPrimaryKey(key);
    }

    public int deleteByExample(RoletomenuExample example) {

        return dao.deleteByExample(example);
    }
}
