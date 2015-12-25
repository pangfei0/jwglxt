package com.jw.identity;

/**
 * Created by 53801 on 2015/8/25-21:20.
 */
public interface IdentityProvider {

    /**
     * @param subject
     * @pdOid 26ae022d-15ac-4415-be04-d8d86c652184
     */
    public Identity createIdentity(String identityString);

}