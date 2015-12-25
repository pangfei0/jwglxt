package com.jw.dao;

import com.jw.bean.Roomrap;
import com.jw.bean.RoomrapExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoomrapMapper {
    int countByExample(RoomrapExample example);

    int deleteByExample(RoomrapExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Roomrap record);

    int insertSelective(Roomrap record);

    List<Roomrap> selectByExample(RoomrapExample example);

    Roomrap selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Roomrap record, @Param("example") RoomrapExample example);

    int updateByExample(@Param("record") Roomrap record, @Param("example") RoomrapExample example);

    int updateByPrimaryKeySelective(Roomrap record);

    int updateByPrimaryKey(Roomrap record);
}