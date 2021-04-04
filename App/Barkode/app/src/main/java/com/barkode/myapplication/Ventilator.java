package com.barkode.myapplication;

import java.util.HashMap;
import java.util.Map;




public class Ventilator {
    public String id; //ventilator id, extracted from barcode, serves as a unique key.
    public String model;
    public String location; //current ventilator location, will udpate
    public String updatedBy; //UID for last updating person
    public String lastUpdateTime;
    public Ventilator(String id, String model){
        //2-Variable constructor, included for the case when ventilator unit must be added to logging system
    }
    public Ventilator(String id, String model, String location, String status, String updatedBy,String lastUpdateTime){
        //4-Variable, default for location updates.
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

//This needs to go somewhere else it's the actual hashmap used to store information


