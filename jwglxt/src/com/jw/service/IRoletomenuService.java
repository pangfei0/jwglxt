package com.jw.service;

import com.jw.bean.Roletomenu;
import com.jw.bean.RoletomenuExample;
import com.jw.bean.RoletomenuKey;
import com.jw.utils.PageBean;

import java.util.List;
        
        /**
  * Created by Pang fei on 2015/8/25.
  */
    public interface IRoletomenuService {
    /**
      * 通过约束条件进行查询
      * @param example
      * @return
      */
    public List<Roletomenu> selectByExample(RoletomenuExample example);

            /**
      * 通过约束条件进行 分页 查询
      * @param example
      * @param start
      * @param end
      * @return
      */
      public PageBean<Roletomenu> getScrollData(RoletomenuExample example,int start,int end);

            /**
      * 添加一个影吧信息
      * @param Roletomenu
      * @return
      */
      public int insert(Roletomenu Roletomenu);

     /**
      * 更新
      * @param Roletomenu
      * @return
      */
      public int updateByPrimaryKey(Roletomenu Roletomenu);

      /**
      * 删除
      * @param key
      * @return
      */
       public int deleteByPrimaryKey(RoletomenuKey key);
            public int deleteByExample(RoletomenuExample example);
        }
