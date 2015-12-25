package com.jw.dao;

import com.jw.bean.Roletomenu;
import com.jw.bean.RoletomenuExample;
import com.jw.bean.RoletomenuKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoletomenuMapper {
    int countByExample(RoletomenuExample example);

    int deleteByExample(RoletomenuExample example);

    int deleteByPrimaryKey(RoletomenuKey key);

    int insert(Roletomenu record);

    int insertSelective(Roletomenu record);

    List<Roletomenu> selectByExample(RoletomenuExample example);

    Roletomenu selectByPrimaryKey(RoletomenuKey key);

    int updateByExampleSelective(@Param("record") Roletomenu record, @Param("example") RoletomenuExample example);

    int updateByExample(@Param("record") Roletomenu record, @Param("example") RoletomenuExample example);

    int updateByPrimaryKeySelective(Roletomenu record);

    int updateByPrimaryKey(Roletomenu record);
}