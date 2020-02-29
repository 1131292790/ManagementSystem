package com.fuchuang.domain;

import java.io.Serializable;

public class Props implements Serializable {

    private static final long serialVersionUID = -8776866026487167649L;
    private String propId;
    private String propName;
    private String propDescription;
    private int propType;

    public String getPropId() {
        return propId;
    }

    public void setPropId(String propId) {
        this.propId = propId;
    }

    public String getPropName() {
        return propName;
    }

    public void setPropName(String propName) {
        this.propName = propName;
    }

    public String getPropDescription() {
        return propDescription;
    }

    public void setPropDescription(String propDescription) {
        this.propDescription = propDescription;
    }

    public int getPropType() {
        return propType;
    }

    public void setPropType(int propType) {
        this.propType = propType;
    }

    @Override
    public String toString() {
        return "Props{" +
                "propId='" + propId + '\'' +
                ", propName='" + propName + '\'' +
                ", propDescription='" + propDescription + '\'' +
                ", propType=" + propType +
                '}';
    }
}
