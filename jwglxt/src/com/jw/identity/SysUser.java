package com.jw.identity;

import com.jw.bean.User;
import com.jw.utils.AbstractBusinessObject;

/**
 * Created by 53801 on 2015/8/25-21:40.
 */
public class SysUser extends AbstractBusinessObject {
    private static final long serialVersionUID = 1L;

    public User getSysUser() {
        return sysUser;
    }
    public SysUser (User sysUser){
        this.sysUser = sysUser;
    }

    public void setSysUser(User sysUser) {
        this.sysUser = sysUser;
    }

    private User sysUser;

    public SysUser(){
        this.sysUser = new User();
    }
    public Integer getId() {
        return this.sysUser.getId();
    }
    public String getUserName(){return  this.sysUser.getUname();}
    public String getRealName(){return  this.sysUser.getRname();}
}
