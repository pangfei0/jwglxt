package com.jw.bean;

public class Roletomenu extends RoletomenuKey {
    private String rolecontroller;

    private String remark;

    private String remark1;

    private String remark2;

    public String getRolecontroller() {
        return rolecontroller;
    }

    public void setRolecontroller(String rolecontroller) {
        this.rolecontroller = rolecontroller == null ? null : rolecontroller.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getRemark1() {
        return remark1;
    }

    public void setRemark1(String remark1) {
        this.remark1 = remark1 == null ? null : remark1.trim();
    }

    public String getRemark2() {
        return remark2;
    }

    public void setRemark2(String remark2) {
        this.remark2 = remark2 == null ? null : remark2.trim();
    }
}