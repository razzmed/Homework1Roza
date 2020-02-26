package com.company;

public class Mission {
    private String place;
    private int missionNumber;

    public Mission(String place, int missionNumber) {
        this.place = place;
        this.missionNumber = missionNumber;
    }

    public String getPlace() {
        return place;
    }

    public int getMissionNumber() {
        return missionNumber;
    }
}
