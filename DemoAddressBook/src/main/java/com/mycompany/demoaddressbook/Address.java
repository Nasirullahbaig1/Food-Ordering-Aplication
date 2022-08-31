package com.mycompany.demoaddressbook;

public class Address {
    private String street,city,state,zip;
    
    Address(String strt,String ct,String state,String zip){
        street=strt;
        city=ct;
        this.state=state;
        this.zip=zip;
        
    }
    public String toString(){
        return street+", "+city+", "+state+", "+zip;
    }
    public String toString(boolean a){
        return street+", "+city+", "+state+", "+zip;
    }
    void setAddress(String strt,String ct,String state,String zip){
        street=strt;
        city=ct;
        this.state=state;
        this.zip=zip;
    }
}