package com.wilfred.springsession.springsession;

import java.io.Serializable;

public class SessionDetails implements Serializable {
    private static final long serialVersionUID = 8850489178248613501L;

    private String location;

    private String accessType;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAccessType() {
        return accessType;
    }

    public void setAccessType(String accessType) {
        this.accessType = accessType;
    }
}
