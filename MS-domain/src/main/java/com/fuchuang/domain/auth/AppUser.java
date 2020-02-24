package com.fuchuang.domain.auth;

import java.io.Serializable;

public class AppUser implements Serializable {
    private static final long serialVersionUID = -218685418260417504L;

    private String userId;
    private String nickName;
    private String phone;
    private String image;
    private String city;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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

    @Override
    public String toString() {
        return "App_User{" +
                "userId='" + userId + '\'' +
                ", nickName='" + nickName + '\'' +
                ", phone='" + phone + '\'' +
                ", image='" + image + '\'' +
                ", city='" + city + '\'' +
                ", passWord='" + passWord + '\'' +
                ", carbonCoin='" + carbonCoin + '\'' +
                '}';
    }
}
