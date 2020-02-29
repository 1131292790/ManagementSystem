package com.fuchuang.domain;

import java.io.Serializable;

public class Land implements Serializable {
    private static final long serialVersionUID = 4154361665256009890L;

    private String landId;
    private String userId;
    private int windTotal;
    private int electTotal;

    public String getLandId() {
        return landId;
    }

    public void setLandId(String landId) {
        this.landId = landId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getWindTotal() {
        return windTotal;
    }

    public void setWindTotal(int windTotal) {
        this.windTotal = windTotal;
    }

    public int getElectTotal() {
        return electTotal;
    }

    public void setElectTotal(int electTotal) {
        this.electTotal = electTotal;
    }

    @Override
    public String toString() {
        return "Land{" +
                "landId='" + landId + '\'' +
                ", userId='" + userId + '\'' +
                ", windTotal=" + windTotal +
                ", electTotal=" + electTotal +
                '}';
    }
}
