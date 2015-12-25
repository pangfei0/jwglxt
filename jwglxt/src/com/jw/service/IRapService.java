package com.jw.service;

import java.util.List;

import com.jw.bean.Rap;
import com.jw.bean.RapExample;
import com.jw.utils.PageBean;

public interface IRapService {
	int addRap(Rap rap);
	int deleteById(int id);
	int updateRap(Rap rap);
	List<Rap>getRapByExample(RapExample example);
	PageBean<Rap> getScrollData(RapExample example, int start, int end);
	Rap getById(int id);


}
