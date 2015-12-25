package com.jw.service;

import java.util.List;

import com.jw.bean.Loginrecord;
import com.jw.bean.LoginrecordExample;
import com.jw.utils.PageBean;

public interface ILoginrecordService {
	int addLoginrecord(Loginrecord loginrecord);
	int deleteById(int id);
	int updateLoginrecord(Loginrecord loginrecord);
	List<Loginrecord>getLoginrecordByExample(LoginrecordExample example);
	PageBean<Loginrecord> getScrollData(LoginrecordExample example, int start, int end);
	Loginrecord getById(int id);


}
