package com.fuchuang.domain;

import com.fasterxml.jackson.annotation.JsonAlias;

import java.io.Serializable;

public class Admin implements Serializable {
    private static final long serialVersionUID = -2504386562473022400L;
    @JsonAlias("username")
    private String adminId;
    @JsonAlias("password")
    private String passWord;
    private String realName;
    private String phoneNum;

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adminId='" + adminId + '\'' +
                ", passWord='" + passWord + '\'' +
                ", realName='" + realName + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                '}';
    }
}
