package com.jw.identity;

import java.io.Serializable;

/**
 * Created by 53801 on 2015/8/25-21:22.
 */
public interface Identity {
    /** @pdOid dc335790-0351-46c6-b1a5-b937ee997389 */
    public Serializable getAccessToken();

    /**
     * @param accessToken
     * @pdOid 6934fe46-ebee-414f-a403-b2834c3086b2
     */
    public void setAccessToken(Serializable accessToken);
}
