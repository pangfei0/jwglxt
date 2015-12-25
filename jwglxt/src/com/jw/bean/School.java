package com.jw.bean;

public class School {
    private Integer id;

    private String scname;

    private String scaddress;

    private String sctelephone;

    private String scwebsite;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getScname() {
        return scname;
    }

    public void setScname(String scname) {
        this.scname = scname == null ? null : scname.trim();
    }

    public String getScaddress() {
        return scaddress;
    }

    public void setScaddress(String scaddress) {
        this.scaddress = scaddress == null ? null : scaddress.trim();
    }

    public String getSctelephone() {
        return sctelephone;
    }

    public void setSctelephone(String sctelephone) {
        this.sctelephone = sctelephone == null ? null : sctelephone.trim();
    }

    public String getScwebsite() {
        return scwebsite;
    }

    public void setScwebsite(String scwebsite) {
        this.scwebsite = scwebsite == null ? null : scwebsite.trim();
    }
}