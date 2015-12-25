package com.jw.service;

import java.util.List;

import com.jw.bean.Roomrap;
import com.jw.bean.RoomrapExample;
import com.jw.utils.PageBean;

public interface IRoomrapService {
	int addRoomrap(Roomrap roomrap);
	int deleteById(int id);
	int updateRoomrap(Roomrap roomrap);
	List<Roomrap>getRoomrapByExample(RoomrapExample example);
	PageBean<Roomrap> getScrollData(RoomrapExample example, int start, int end);
	Roomrap getById(int id);


}
