package com.jw.utils;

import com.jw.bean.User;
import com.jw.identity.SysUser;

/**
 * Created by 53801 on 2015/8/25-21:54.
 */
public interface AppContext {
    SysUser getUser();

    void setUser(SysUser user);
}
