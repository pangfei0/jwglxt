package com.jw.dao;

import com.jw.bean.Rap;
import com.jw.bean.RapExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RapMapper {
    int countByExample(RapExample example);

    int deleteByExample(RapExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Rap record);

    int insertSelective(Rap record);

    List<Rap> selectByExample(RapExample example);

    Rap selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Rap record, @Param("example") RapExample example);

    int updateByExample(@Param("record") Rap record, @Param("example") RapExample example);

    int updateByPrimaryKeySelective(Rap record);

    int updateByPrimaryKey(Rap record);
}