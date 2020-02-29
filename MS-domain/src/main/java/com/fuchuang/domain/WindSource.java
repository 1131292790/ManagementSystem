package com.fuchuang.domain;

import java.io.Serializable;

public class WindSource implements Serializable {

    private static final long serialVersionUID = 2320832862558036042L;
    private String sourceId;
    private int sourceBase;
    private String sourceType;
    private String description;

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public int getSourceBase() {
        return sourceBase;
    }

    public void setSourceBase(int sourceBase) {
        this.sourceBase = sourceBase;
    }

    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    @Override
    public String toString() {
        return "WindSource{" +
                "sourceId='" + sourceId + '\'' +
                ", sourceBase=" + sourceBase +
                ", sourceType='" + sourceType + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
