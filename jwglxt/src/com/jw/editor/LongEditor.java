package com.jw.editor;

import java.beans.PropertyEditorSupport;

import org.springframework.util.StringUtils;

public class LongEditor extends PropertyEditorSupport {
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        if (text == null || text.equals(""))
            text = "0";
        if (!StringUtils.hasText(text)) {
            setValue(null);
        } else {
            setValue(Long.parseLong(text));// ��仰������Ҫ�ģ�����Ŀ����ͨ�����������������ƥ����Ӧ��databind
        }
    }

    @Override
    public String getAsText() {

        return getValue().toString();
    }
}