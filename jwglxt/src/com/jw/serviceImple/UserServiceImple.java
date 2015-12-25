package com.jw.serviceImple;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.jw.bean.User;
import com.jw.bean.UserExample;
import com.jw.dao.UserMapper;
import com.jw.service.IUserService;
import com.jw.utils.PageBean;

@Service("userService")
public class UserServiceImple implements IUserService{
	@Resource
    private UserMapper userDao;

    public PageBean<User> getScrollData(UserExample userExample, int start, int end) {
        //PageHelper.startPage(PaginationContext.getPageNum(), PaginationContext.getPageSize());
        PageHelper.startPage(start, end);
        List<User> list = this.userDao.selectByExample(userExample);
        return new PageBean<User>(list);
    }

    public User getUserByUsername(String username) {
        UserExample example = new UserExample();
        example.or().andUnameEqualTo(username);
        List<User> userList = this.userDao.selectByExample(example);
        if(userList.size() > 0)
            return  userList.get(0);
        return null;
    }

    public User getUserByUserID(Integer userid){
        return userDao.selectByPrimaryKey(userid);
    }

    public User checkLogin(String username, String passwd) {
        UserExample example = new UserExample();
        example.or().andUnameEqualTo(username).andUpwdEqualTo(passwd);
        List<User> userList = this.userDao.selectByExample(example);
        if(userList.size() > 0)
            return  userList.get(0);
        return null;
    }

    public int updateByPrimaryKey(User record)  {
        return this.userDao.updateByPrimaryKey(record);
    }

    public int insert(User record)  {
        return this.userDao.insert(record);
    }

    public int deleteByPrimaryKey(Integer userid) {
        return this.userDao.deleteByPrimaryKey(userid);
    }

    public List<User> getUserByRole(int role){
        UserExample example = new UserExample();
        example.or().andRoleidEqualTo(role);
        List<User> userList = userDao.selectByExample(example);
        return userList;
    }
}
