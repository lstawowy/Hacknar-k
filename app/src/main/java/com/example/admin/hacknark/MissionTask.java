package com.example.admin.hacknark;

/**
 * Created by usuryjskij on 10.03.18.
 */

public class MissionTask {
    public enum TaskType{
        QUESTION,SEARCH
    }
    private String description;
    private boolean isDone;
    private double longitude;
    private double latitude;
    private double minLongitude;
    private double maxLongitude;
    private double minLatitude;
    private double maxLatitude;
    //private boolean extraQuestion;

    public MissionTask(String des, double longitude, double latitude, TaskType type){
        this. description = des;
        this.longitude = longitude;
        this.latitude = latitude;
        this.isDone = false;
        //this.extraQuestion = extra;
    }

    public boolean userInTaskArea(double longitude, double latitude){
        if(longitude > this.minLongitude && longitude < this.maxLongitude
                && latitude > this.minLatitude && latitude < this.maxLatitude)
            return true;
        return false;
    }
}
