package com.jw.utils;

/**
 * Created by 53801 on 2015/8/25-21:55.
 */
public class AppContextHolder {

    private static final InheritableThreadLocal<AppContext> holder = new InheritableThreadLocal<AppContext>() {

        protected AppContext initialValue() {
            return null;
        }

    };

    public static AppContext getContext() {
        return holder.get();
    }

    public static void setContext(AppContext context) {
        holder.set(context);
    }

}
