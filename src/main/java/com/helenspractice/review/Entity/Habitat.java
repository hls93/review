package com.helenspractice.review.Entity;

import javax.persistence.Entity;

@Entity
public class Habitat {

    private String type;
    private String location;
    private boolean isCold;

    public Habitat(String type, String location, boolean isCold) {
        this.type = type;
        this.location = location;
        this.isCold = isCold;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isCold() {
        return isCold;
    }

    public void setCold(boolean cold) {
        isCold = cold;
    }
}
