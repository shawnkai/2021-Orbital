package com.example.myapplication.ui.login;

public class Carpark {
    private String carparkName;
    private double latitude;
    private double longitude;
    private int distance;

    public Carpark(String carparkName, double latitude, double longitude) {
        this.carparkName = carparkName;
        this.latitude = latitude;
        this.longitude = longitude;
        distance = Integer.MAX_VALUE;
    }

    public Carpark(String carparkName, double latitude, double longitude, int distance) {
        this.carparkName = carparkName;
        this.latitude = latitude;
        this.longitude = longitude;
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getCarparkName() {
        return carparkName;
    }

    public void setCarparkName(String carparkName) {
        this.carparkName = carparkName;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
}

