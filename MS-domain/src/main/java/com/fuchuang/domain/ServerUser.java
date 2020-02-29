package com.fuchuang.domain;

import java.io.Serializable;
import java.util.Date;

public class ServerUser implements Serializable {

    private static final long serialVersionUID = 5629808849564722835L;
    private String userId;
    private String mobilePhone;
    private Date birthday;
    private String nickName;
    private String cityId;
    private String cityName;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public String toString() {
        return "ServerUser{" +
                "userId='" + userId + '\'' +
                ", mobilePhone='" + mobilePhone + '\'' +
                ", birthday=" + birthday +
                ", nickName='" + nickName + '\'' +
                ", cityId='" + cityId + '\'' +
                ", cityName='" + cityName + '\'' +
                '}';
    }
}
