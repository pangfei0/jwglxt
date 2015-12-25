package com.jw.service;

import java.util.List;

import com.jw.bean.Comment;
import com.jw.bean.CommentExample;
import com.jw.utils.PageBean;

public interface ICommentService {
	int addComment(Comment comment);
	int deleteById(int id);
	int updateComment(Comment comment);
	List<Comment>getCommentByExample(CommentExample example);
	PageBean<Comment> getScrollData(CommentExample example, int start, int end);
	Comment getById(int id);


}
