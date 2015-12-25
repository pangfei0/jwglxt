package com.jw.editor;

import com.jw.common.DateUtil;
import org.springframework.util.StringUtils;

import java.beans.PropertyEditorSupport;
import java.util.Date;

/**
 * Created by 53801 on 2015/8/18-0:38.
 */
public class DateEditor extends PropertyEditorSupport {
    @Override
    public void setAsText(String text) throws IllegalArgumentException {

        if (!StringUtils.hasText(text)) {
            setValue(null);
        } else {
           /* if(text.length()>11)*/
            setValue(DateUtil.string2Date(text, "yyyy-MM-dd HH:mm:ss"));
/*            else
                setValue(DateUtil.string2Date(text, "yyyy-MM-dd"));*/
        }
    }

    @Override
    public String getAsText() {
        System.out.println("test1");
        return DateUtil.date2String((Date)getValue(),"yyyy-MM-dd HH:mm:ss");
        //return getValue().toString();
    }
}
