package com.jw.editor;

/**
 * Created by 53801 on 2015/8/18-0:51.
 */
import java.beans.PropertyEditorSupport;

import org.springframework.util.StringUtils;

public class DoubleEditor extends PropertyEditorSupport {
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        if (text == null || text.equals(""))
            text = "0";
        if (!StringUtils.hasText(text)) {
            setValue(null);
        } else {
            setValue(Double.parseDouble(text));// ��仰������Ҫ�ģ�����Ŀ����ͨ�����������������ƥ����Ӧ��databind
        }
    }

    @Override
    public String getAsText() {

        return getValue().toString();
    }
}
