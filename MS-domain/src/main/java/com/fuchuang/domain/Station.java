package com.fuchuang.domain;

import java.io.Serializable;

public class Station implements Serializable {

    private static final long serialVersionUID = 8407011815198906889L;
    private String staId;
    private String staName;
    private String staNo;

    public String getStaId() {
        return staId;
    }

    public void setStaId(String staId) {
        this.staId = staId;
    }

    public String getStaName() {
        return staName;
    }

    public void setStaName(String staName) {
        this.staName = staName;
    }

    public String getStaNo() {
        return staNo;
    }

    public void setStaNo(String staNo) {
        this.staNo = staNo;
    }

    @Override
    public String toString() {
        return "Station{" +
                "staId='" + staId + '\'' +
                ", staName='" + staName + '\'' +
                ", staNo='" + staNo + '\'' +
                '}';
    }
}
