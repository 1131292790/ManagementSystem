package com.fuchuang.domain;

import java.io.Serializable;
import java.sql.Date;

public class Notify implements Serializable {

    private static final long serialVersionUID = 8621273596494218482L;

    private String notifyId;
    private String notifyTitle;
    private String content;
    private int notifyType;
    private Date sendTime;
    private String fromAdmin;

    public String getNotifyId() {
        return notifyId;
    }

    public void setNotifyId(String notifyId) {
        this.notifyId = notifyId;
    }

    public String getNotifyTitle() {
        return notifyTitle;
    }

    public void setNotifyTitle(String notifyTitle) {
        this.notifyTitle = notifyTitle;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getNotifyType() {
        return notifyType;
    }

    public void setNotifyType(int notifyType) {
        this.notifyType = notifyType;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public String getFromAdmin() {
        return fromAdmin;
    }

    public void setFromAdmin(String fromAdmin) {
        this.fromAdmin = fromAdmin;
    }

    @Override
    public String toString() {
        return "Notify{" +
                "notifyId=" + notifyId +
                ", title='" + notifyTitle + '\'' +
                ", content='" + content + '\'' +
                ", type=" + notifyType +
                ", sendTime=" + sendTime +
                ", fromAdmin='" + fromAdmin + '\'' +
                '}';
    }
}
