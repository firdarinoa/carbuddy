package com.example.firdasahidi.carbuddy.model;

/**
 * Created by FirdaRinoa on 11/1/17.
 */

public class ScanHistoryModel {

    private  String date;

    public ScanHistoryModel(){

    }

    public ScanHistoryModel(String date){
        this.date = date;
    }

    public String getDate(){
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
