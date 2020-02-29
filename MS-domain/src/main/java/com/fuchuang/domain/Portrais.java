package com.fuchuang.domain;

import java.io.Serializable;

public class Portrais implements Serializable {
    private static final long serialVersionUID = 6647229086835562616L;

    private String portraisId;
    private String userId;
    private String gender;
    private String nation;
    private int ageInterval;
    private int weekAver;
    private int avgPrice;
    private boolean frequentTvl;
    private boolean regularTvl;
    private String homePlace;
    private String workPlace;
    private String oftenPlace;

    public String getPortraisId() {
        return portraisId;
    }

    public void setPortraisId(String portraisId) {
        this.portraisId = portraisId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public int getAgeInterval() {
        return ageInterval;
    }

    public void setAgeInterval(int ageInterval) {
        this.ageInterval = ageInterval;
    }

    public int getWeekAver() {
        return weekAver;
    }

    public void setWeekAver(int weekAver) {
        this.weekAver = weekAver;
    }

    public int getAvgPrice() {
        return avgPrice;
    }

    public void setAvgPrice(int avgPrice) {
        this.avgPrice = avgPrice;
    }

    public boolean isFrequentTvl() {
        return frequentTvl;
    }

    public void setFrequentTvl(boolean frequentTvl) {
        this.frequentTvl = frequentTvl;
    }

    public boolean isRegularTvl() {
        return regularTvl;
    }

    public void setRegularTvl(boolean regularTvl) {
        this.regularTvl = regularTvl;
    }

    public String getHomePlace() {
        return homePlace;
    }

    public void setHomePlace(String homePlace) {
        this.homePlace = homePlace;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    public String getOftenPlace() {
        return oftenPlace;
    }

    public void setOftenPlace(String oftenPlace) {
        this.oftenPlace = oftenPlace;
    }

    @Override
    public String toString() {
        return "Portrais{" +
                "portraisId='" + portraisId + '\'' +
                ", userId='" + userId + '\'' +
                ", gender='" + gender + '\'' +
                ", nation='" + nation + '\'' +
                ", ageInterval=" + ageInterval +
                ", weekAver=" + weekAver +
                ", avgPrice=" + avgPrice +
                ", frequentTvl=" + frequentTvl +
                ", regularTvl=" + regularTvl +
                ", homePlace='" + homePlace + '\'' +
                ", workPlace='" + workPlace + '\'' +
                ", oftenPlace='" + oftenPlace + '\'' +
                '}';
    }
}
