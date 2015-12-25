package com.jw.bean;

import java.util.Date;

public class Log {
    private Integer logid;

    private String classes;

    private String cmethod;

    private String loglevel;

    private String operateuser;

    private String msg;

    private Date createtime;

    public Integer getLogid() {
        return logid;
    }

    public void setLogid(Integer logid) {
        this.logid = logid;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes == null ? null : classes.trim();
    }

    public String getCmethod() {
        return cmethod;
    }

    public void setCmethod(String cmethod) {
        this.cmethod = cmethod == null ? null : cmethod.trim();
    }

    public String getLoglevel() {
        return loglevel;
    }

    public void setLoglevel(String loglevel) {
        this.loglevel = loglevel == null ? null : loglevel.trim();
    }

    public String getOperateuser() {
        return operateuser;
    }

    public void setOperateuser(String operateuser) {
        this.operateuser = operateuser == null ? null : operateuser.trim();
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg == null ? null : msg.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}