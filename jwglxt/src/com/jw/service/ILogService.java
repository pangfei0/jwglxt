package com.jw.service;

import java.util.List;

import com.jw.bean.Log;
import com.jw.bean.LogExample;
import com.jw.utils.PageBean;

public interface ILogService {
	int addLog(Log operationlog);
	int deleteById(int id);
	int updateLog(Log operationlog);
	List<Log>getLogByExample(LogExample example);
	PageBean<Log> getScrollData(LogExample example, int start, int end);
	Log getById(int id);


}
