package com.jw.service;

import java.util.List;

import com.jw.bean.Leader;
import com.jw.bean.LeaderExample;
import com.jw.utils.PageBean;

public interface ILeaderService {
	int addLeader(Leader leader);
	int deleteById(int id);
	int updateLeader(Leader leader);
	List<Leader>getLeaderByExample(LeaderExample example);
	PageBean<Leader> getScrollData(LeaderExample example, int start, int end);
	Leader getById(int id);


}
