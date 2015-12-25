package com.jw.bean;

public class Teacher {
    private Integer id;

    private String tnum;

    private String tname;

    private Integer tsex;

    private Integer tnation;

    private String tnative;

    private Integer tpolstatus;

    private String tcard;

    private String taddress;

    private String telephone;

    private String remark1;

    private String remark2;

    private String remark3;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTnum() {
        return tnum;
    }

    public void setTnum(String tnum) {
        this.tnum = tnum == null ? null : tnum.trim();
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname == null ? null : tname.trim();
    }

    public Integer getTsex() {
        return tsex;
    }

    public void setTsex(Integer tsex) {
        this.tsex = tsex;
    }

    public Integer getTnation() {
        return tnation;
    }

    public void setTnation(Integer tnation) {
        this.tnation = tnation;
    }

    public String getTnative() {
        return tnative;
    }

    public void setTnative(String tnative) {
        this.tnative = tnative == null ? null : tnative.trim();
    }

    public Integer getTpolstatus() {
        return tpolstatus;
    }

    public void setTpolstatus(Integer tpolstatus) {
        this.tpolstatus = tpolstatus;
    }

    public String getTcard() {
        return tcard;
    }

    public void setTcard(String tcard) {
        this.tcard = tcard == null ? null : tcard.trim();
    }

    public String getTaddress() {
        return taddress;
    }

    public void setTaddress(String taddress) {
        this.taddress = taddress == null ? null : taddress.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
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

    public String getRemark3() {
        return remark3;
    }

    public void setRemark3(String remark3) {
        this.remark3 = remark3 == null ? null : remark3.trim();
    }
}