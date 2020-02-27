package com.fuchuang.domain.adv;

import java.io.Serializable;
import java.sql.Date;

public class Notify implements Serializable {

    private static final long serialVersionUID = 8621273596494218482L;

    private int notifyId;
    private String title;
    private String content;
    private int type;
    private Date sendTime;
    private String fromAdmin;

    public int getNotifyId() {
        return notifyId;
    }

    public void setNotifyId(int notifyId) {
        this.notifyId = notifyId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
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
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", type=" + type +
                ", sendTime=" + sendTime +
                ", fromAdmin='" + fromAdmin + '\'' +
                '}';
    }
}
