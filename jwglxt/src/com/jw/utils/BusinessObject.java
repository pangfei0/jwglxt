package com.jw.utils;

import java.io.Serializable;

/**
 * Created by 53801 on 2015/8/25-21:40.
 */
public interface BusinessObject extends Serializable {

    Serializable getId();

    boolean isNew();

    String getCacheKey();

}