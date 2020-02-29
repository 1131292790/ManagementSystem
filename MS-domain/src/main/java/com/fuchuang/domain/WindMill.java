package com.fuchuang.domain;

import java.io.Serializable;
import java.util.Date;

public class WindMill implements Serializable {
    private static final long serialVersionUID = -5089628321062875490L;
    private String windmillId;
    private int windCurrent;
    private int electCurrent;
    private int windNeed;
    private int electNeed;
    private String detail;
    private Date createTime;
    private int windmillStatus;
    private String realLocation;

    public String getWindmillId() {
        return windmillId;
    }

    public void setWindmillId(String windmillId) {
        this.windmillId = windmillId;
    }

    public int getWindCurrent() {
        return windCurrent;
    }

    public void setWindCurrent(int windCurrent) {
        this.windCurrent = windCurrent;
    }

    public int getElectCurrent() {
        return electCurrent;
    }

    public void setElectCurrent(int electCurrent) {
        this.electCurrent = electCurrent;
    }

    public int getWindNeed() {
        return windNeed;
    }

    public void setWindNeed(int windNeed) {
        this.windNeed = windNeed;
    }

    public int getElectNeed() {
        return electNeed;
    }

    public void setElectNeed(int electNeed) {
        this.electNeed = electNeed;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getWindmillStatus() {
        return windmillStatus;
    }

    public void setWindmillStatus(int windmillStatus) {
        this.windmillStatus = windmillStatus;
    }

    public String getRealLocation() {
        return realLocation;
    }

    public void setRealLocation(String realLocation) {
        this.realLocation = realLocation;
    }

    @Override
    public String toString() {
        return "WindMill{" +
                "windmillId='" + windmillId + '\'' +
                ", windCurrent=" + windCurrent +
                ", electCurrent=" + electCurrent +
                ", windNeed=" + windNeed +
                ", electNeed=" + electNeed +
                ", detail='" + detail + '\'' +
                ", createTime=" + createTime +
                ", windmillStatus=" + windmillStatus +
                ", realLocation='" + realLocation + '\'' +
                '}';
    }
}
