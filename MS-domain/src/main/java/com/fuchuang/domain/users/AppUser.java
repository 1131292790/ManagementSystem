package com.fuchuang.domain.users;

import java.io.Serializable;

public class  AppUser implements Serializable {
    private static final long serialVersionUID = -218685418260417504L;

    private String userId;
    private String nickName;
    private String phoneNum;
    private String imgUrl;
    private String cityName;
    private String passWord;
    private String carbonCoin;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getCarbonCoin() {
        return carbonCoin;
    }

    public void setCarbonCoin(String carbonCoin) {
        this.carbonCoin = carbonCoin;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public String toString() {
        return "AppUser{" +
                "userId='" + userId + '\'' +
                ", nickName='" + nickName + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", cityName='" + cityName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", carbonCoin='" + carbonCoin + '\'' +
                '}';
    }
}
