package com.example.restservice_client;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Item {

    String id;

    public Item(){

    }

    public String getId(){
        return id;
    }

    @Override
    public String toString(){
        return "Item{" +
        "id:'" + id + 
        "'}";
    }

    
    
}
