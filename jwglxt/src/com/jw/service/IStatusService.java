package com.jw.service;

import java.util.List;

import com.jw.bean.Status;
import com.jw.bean.StatusExample;
import com.jw.utils.PageBean;

public interface IStatusService {
	int addStatus(Status status);
	int deleteById(int id);
	int updateStatus(Status status);
	List<Status>getStatusByExample(StatusExample example);
	PageBean<Status> getScrollData(StatusExample example, int start, int end);
	Status getById(int id);


}
