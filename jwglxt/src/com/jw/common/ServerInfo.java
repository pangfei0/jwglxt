package com.jw.common;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by 53801 on 2015/8/18-1:53.
 */
public class ServerInfo {
    public static boolean isAjax(HttpServletRequest request) {
        if (request != null
                && "XMLHttpRequest".equalsIgnoreCase(request
                .getHeader("X-Requested-With")))
            return true;
        return false;
    }
}
