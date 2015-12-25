package com.jw.service;

import java.util.List;

import com.jw.bean.Room;
import com.jw.bean.RoomExample;
import com.jw.utils.PageBean;

public interface IRoomService {
	int addRoom(Room room);
	int deleteById(int id);
	int updateRoom(Room room);
	List<Room>getRoomByExample(RoomExample example);
	PageBean<Room> getScrollData(RoomExample example, int start, int end);
	Room getById(int id);


}
