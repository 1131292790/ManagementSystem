package com.fuchuang.domain;

import java.io.Serializable;
import java.util.Date;

public class Product implements Serializable {

    private static final long serialVersionUID = -5909849493280356012L;
    private String productId;
    private String userId;
    private String windSourceId;
    private Date createTime;
    private int electCurrent;
    private int windCurrent;
    private int productStatus;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }


    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getElectCurrent() {
        return electCurrent;
    }

    public void setElectCurrent(int electCurrent) {
        this.electCurrent = electCurrent;
    }

    public int getWindCurrent() {
        return windCurrent;
    }

    public void setWindCurrent(int windCurrent) {
        this.windCurrent = windCurrent;
    }

    public int getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(int productStatus) {
        this.productStatus = productStatus;
    }

    public String getWindSourceId() {
        return windSourceId;
    }

    public void setWindSourceId(String windSourceId) {
        this.windSourceId = windSourceId;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", userId='" + userId + '\'' +
                ", windSourceId='" + windSourceId + '\'' +
                ", createTime=" + createTime +
                ", electCurrent=" + electCurrent +
                ", windCurrent=" + windCurrent +
                ", productStatus=" + productStatus +
                '}';
    }
}
