package com.example.moncvapp;

public class Formation {
    private String obtentionDate;
    private String deegree;
    private String place;

    public Formation (String obtentionDate, String deegree, String place) {
        this.obtentionDate = obtentionDate;
        this.deegree = deegree;
        this.place = place;
    }

    public String getObtentionDate() {
        return obtentionDate;
    }

    public void setObtentionDate(String obtentionDate) {
        this.obtentionDate = obtentionDate;
    }

    public String getDeegree() {
        return deegree;
    }

    public void setDeegree(String deegree) {
        this.deegree = deegree;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}
