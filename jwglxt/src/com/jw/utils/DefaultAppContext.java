package com.jw.utils;

import com.jw.bean.User;
import com.jw.identity.SysUser;

/**
 * Created by 53801 on 2015/8/25-21:54.
 */
public class DefaultAppContext implements AppContext {

    private SysUser user = null;

    public DefaultAppContext() {
    }

    public SysUser getUser() {
        return this.user;
    }



    public void setUser(SysUser user) {
        this.user = user;
    }


}