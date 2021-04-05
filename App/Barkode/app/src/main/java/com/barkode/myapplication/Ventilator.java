package com.barkode.myapplication;

import java.util.HashMap;
import java.util.Map;




public class Ventilator {
    public String id; //ventilator id, extracted from barcode, serves as a unique key.
    public String model;
    public String location; //current ventilator location, will udpate
    public String updatedBy; //UID for last updating person
    public String status;
    public String lastUpdateTime;
    public Ventilator(String id, String model){
        //2-Variable constructor, included for the case when ventilator unit must be added to logging system
    }
    public Ventilator(String id, String model, String location, String status, String updatedBy,String lastUpdateTime){
       this.id=id;
       this.model=model;
       this.location=location;
       this.status=status;
       this.updatedBy=updatedBy;
       this.lastUpdateTime=lastUpdateTime;
    }
    //Getter Methods for Quick access to database information.
    private String getid(){
        return this.id;
    }
    private String getUpdateTime(){
        return this.lastUpdateTime;
    }
    private String getLocation(){
        return this.location;
    }
}




