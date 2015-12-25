package com.jw.bean;

import java.util.Date;

public class Roomcurrentstate {
    private Integer rcsid;

    private Integer roomid;

    private Integer netstate;

    private Integer playstate;

    private Integer orderid;

    private Integer playmovieid;

    private Date updatetime;

    private String remark;

    public Integer getRcsid() {
        return rcsid;
    }

    public void setRcsid(Integer rcsid) {
        this.rcsid = rcsid;
    }

    public Integer getRoomid() {
        return roomid;
    }

    public void setRoomid(Integer roomid) {
        this.roomid = roomid;
    }

    public Integer getNetstate() {
        return netstate;
    }

    public void setNetstate(Integer netstate) {
        this.netstate = netstate;
    }

    public Integer getPlaystate() {
        return playstate;
    }

    public void setPlaystate(Integer playstate) {
        this.playstate = playstate;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getPlaymovieid() {
        return playmovieid;
    }

    public void setPlaymovieid(Integer playmovieid) {
        this.playmovieid = playmovieid;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}