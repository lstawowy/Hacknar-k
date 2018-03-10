package com.example.admin.hacknark;

/**
 * Created by usuryjskij on 10.03.18.
 */

public class User {
    private double longitude;
    private double latitude;

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude(){
        return longitude;
    }

    public void setLongitude(double l){
        this.longitude = l;
    }

    public void setLatitude(double l){
        this.latitude = l;
    }
}
