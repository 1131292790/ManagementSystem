package com.fuchuang.domain;

import java.io.Serializable;
import java.util.Date;

public class Trip implements Serializable {

    private static final long serialVersionUID = -4087846264443756266L;
    private int tripId;
    private String userId;
    private String cityId;
    private String inStationId;
    private String inLineId;
    private Date inTime;
    private Date outTime;
    private String outStationId;
    private String outLineId;
    private int price;
    private int mileage;
    private int tripStatus;

    public int getTripId() {
        return tripId;
    }

    public void setTripId(int tripId) {
        this.tripId = tripId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getInStationId() {
        return inStationId;
    }

    public void setInStationId(String inStationId) {
        this.inStationId = inStationId;
    }

    public String getInLineId() {
        return inLineId;
    }

    public void setInLineId(String inLineId) {
        this.inLineId = inLineId;
    }

    public Date getInTime() {
        return inTime;
    }

    public void setInTime(Date inTime) {
        this.inTime = inTime;
    }

    public Date getOutTime() {
        return outTime;
    }

    public void setOutTime(Date outTime) {
        this.outTime = outTime;
    }

    public String getOutStationId() {
        return outStationId;
    }

    public void setOutStationId(String outStationId) {
        this.outStationId = outStationId;
    }

    public String getOutLineId() {
        return outLineId;
    }

    public void setOutLineId(String outLineId) {
        this.outLineId = outLineId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getTripStatus() {
        return tripStatus;
    }

    public void setTripStatus(int tripStatus) {
        this.tripStatus = tripStatus;
    }

    @Override
    public String toString() {
        return "Trip{" +
                "tripId=" + tripId +
                ", userId='" + userId + '\'' +
                ", cityId='" + cityId + '\'' +
                ", inStationId='" + inStationId + '\'' +
                ", inLineId='" + inLineId + '\'' +
                ", inTime=" + inTime +
                ", outTime=" + outTime +
                ", outStationId='" + outStationId + '\'' +
                ", outLineId='" + outLineId + '\'' +
                ", price=" + price +
                ", mileage=" + mileage +
                ", tripStatus=" + tripStatus +
                '}';
    }
}
