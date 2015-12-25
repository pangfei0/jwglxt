package com.jw.identity;

import com.jw.bean.User;
import com.jw.utils.AppContext;
import com.jw.utils.AppContextHolder;
import com.jw.utils.DefaultAppContext;
import org.apache.log4j.Logger;

import javax.servlet.http.HttpSession;

/**
 * Created by 53801 on 2015/8/25-21:19.
 */
public class Validator implements IdentityProvider {

    private static final Logger log = Logger.getLogger(Validator.class);

    private static ThreadLocal<Validator> validatorHolder = new ThreadLocal<Validator>() {

        protected Validator initialValue() {
            return new Validator();
        }

    };


    private HttpSession session = null;

    private SysUser user = null;

    private Validator() {
    }

    public static Validator getInstance() {
        return validatorHolder.get();
    }

    public Validator init(HttpSession session) {
        this.session = session;
        return  this;
    }

    public boolean validate() {
        log.debug("will validate session.");
        if (session == null) {
            log.warn("the session is null.");
            return false;
        }

        boolean expired = false;

        try {
            this.user = (SysUser) session.getAttribute(Constants.AUTHENTICATION_KEY);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (this.user == null) {
            expired = true;
        }
        if (!expired) {
            if (log.isDebugEnabled()) {
                log.debug("validating session successfully.");
            }

            log.debug("validate account successfully.");

            return true;
        }

        log.debug("validating session failed.");

        return false;
    }

    public void confirm() {
        if (this.user == null) {
            throw new IllegalArgumentException("authentication is null.");
        }

        AppContext context = AppContextHolder.getContext();
        if (context == null) {
            context = new DefaultAppContext();
            AppContextHolder.setContext(context);
        }

        context.setUser(user);

    }

    public void cancel() {
        this.session = null;
        this.user = null;
        AppContext context = AppContextHolder.getContext();
        if (context != null) {
            context.setUser(null);
        }
    }

    public void clear() {
        this.session = null;
        this.user = null;
        AppContext context = AppContextHolder.getContext();
        if (context != null) {
            context.setUser(null);
        }
    }

    public Identity createIdentity(String identityString) {
        if (identityString == null) {
            return null;
        }

        return new SessionIdentity(identityString);
    }
}