package com.jw.dao;

import com.jw.bean.Roomcurrentstate;
import com.jw.bean.RoomcurrentstateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoomcurrentstateMapper {
    int countByExample(RoomcurrentstateExample example);

    int deleteByExample(RoomcurrentstateExample example);

    int deleteByPrimaryKey(Integer rcsid);

    int insert(Roomcurrentstate record);

    int insertSelective(Roomcurrentstate record);

    List<Roomcurrentstate> selectByExample(RoomcurrentstateExample example);

    Roomcurrentstate selectByPrimaryKey(Integer rcsid);

    int updateByExampleSelective(@Param("record") Roomcurrentstate record, @Param("example") RoomcurrentstateExample example);

    int updateByExample(@Param("record") Roomcurrentstate record, @Param("example") RoomcurrentstateExample example);

    int updateByPrimaryKeySelective(Roomcurrentstate record);

    int updateByPrimaryKey(Roomcurrentstate record);
}