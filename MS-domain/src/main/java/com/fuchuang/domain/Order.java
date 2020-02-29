package com.fuchuang.domain;

import java.io.Serializable;
import java.sql.Date;

public class Order implements Serializable {
    private static final long serialVersionUID = 1125915970147211339L;

    private String orderId;
    private String itemId;
    private int itemNum;
    private String userId;
    private Date createTime;


    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public int getItemNum() {
        return itemNum;
    }

    public void setItemNum(int itemNum) {
        this.itemNum = itemNum;
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

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", itemId='" + itemId + '\'' +
                ", itemNum=" + itemNum +
                ", userId='" + userId + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
