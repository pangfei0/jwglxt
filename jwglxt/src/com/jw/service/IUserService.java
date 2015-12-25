package com.jw.service;

import com.jw.bean.User;
import com.jw.bean.UserExample;
import com.jw.utils.PageBean;

import java.util.List;

/**
 * Created by wangpu on 2015/8/12.
 */
public interface IUserService {

    public PageBean<User> getScrollData(UserExample userExample, int start, int end);

    public User getUserByUsername(String username);

    public User getUserByUserID(Integer userid);

    public User checkLogin(String username, String passwd);

    /**
     * 通过主键更新用户
     * @param record
     * @return
     */
    public int updateByPrimaryKey(User record);

    /**
     * 添加用户
     * @param record
     * @return
     */
    public int insert(User record);

    /**
     * 删除用户
     * @param userid
     * @return
     */
    public int deleteByPrimaryKey(Integer userid);

    /**
     * 通过角色查找用户
     * @param role
     * @return
     */
    public List<User> getUserByRole(int role);
}
