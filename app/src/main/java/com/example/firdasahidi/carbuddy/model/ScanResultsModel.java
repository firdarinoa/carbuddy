package com.example.firdasahidi.carbuddy.model;

import com.example.firdasahidi.carbuddy.ui.ScanResultsActivity;

/**
 * Created by FirdaRinoa on 11/6/17.
 */

public class ScanResultsModel {

    private String title, desc;

    public ScanResultsModel(){

    }

    public  ScanResultsModel(String title, String desc){
        this.title = title;
        this.desc = desc;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getDesc(){
        return desc;
    }

    public void setDesc(String desc){
        this.desc = desc;
    }
}
