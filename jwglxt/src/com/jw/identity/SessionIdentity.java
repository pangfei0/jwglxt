package com.jw.identity;

import java.io.Serializable;

/**
 * Created by 53801 on 2015/8/25-21:35.
 */
public class SessionIdentity implements Identity {

    private Serializable accessToken = null;

    public SessionIdentity(Serializable accessToken) {
        this.accessToken = accessToken;
    }

    public Serializable getAccessToken() {
        return this.accessToken;
    }

    public void setAccessToken(Serializable accessToken) {
        this.accessToken = accessToken;
    }

}