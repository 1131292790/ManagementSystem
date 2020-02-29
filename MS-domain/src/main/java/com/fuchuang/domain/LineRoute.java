package com.fuchuang.domain;

import java.io.Serializable;

public class LineRoute implements Serializable {

    private static final long serialVersionUID = -4335567791145376063L;
    private String lineId;
    private String lineName;

    public String getLineId() {
        return lineId;
    }

    public void setLineId(String lineId) {
        this.lineId = lineId;
    }

    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    @Override
    public String toString() {
        return "LineRoute{" +
                "lineId='" + lineId + '\'' +
                ", lineName='" + lineName + '\'' +
                '}';
    }
}
