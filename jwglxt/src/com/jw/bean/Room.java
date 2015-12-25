package com.jw.bean;

public class Room {
    private Integer id;

    private String buildingnum;

    private String roomnum;

    private Integer roomteacherid;

    private Integer cleanteacherid;

    private String remark;

    private String remark1;

    private String remakr2;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBuildingnum() {
        return buildingnum;
    }

    public void setBuildingnum(String buildingnum) {
        this.buildingnum = buildingnum == null ? null : buildingnum.trim();
    }

    public String getRoomnum() {
        return roomnum;
    }

    public void setRoomnum(String roomnum) {
        this.roomnum = roomnum == null ? null : roomnum.trim();
    }

    public Integer getRoomteacherid() {
        return roomteacherid;
    }

    public void setRoomteacherid(Integer roomteacherid) {
        this.roomteacherid = roomteacherid;
    }

    public Integer getCleanteacherid() {
        return cleanteacherid;
    }

    public void setCleanteacherid(Integer cleanteacherid) {
        this.cleanteacherid = cleanteacherid;
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

    public String getRemakr2() {
        return remakr2;
    }

    public void setRemakr2(String remakr2) {
        this.remakr2 = remakr2 == null ? null : remakr2.trim();
    }
}