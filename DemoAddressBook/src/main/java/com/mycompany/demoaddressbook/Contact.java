/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demoaddressbook;

/**
 *
 * @author aftab
 */
public class Contact extends Person{
    private Date DOB;
    private Address address;
    private String relation;
    private long phoneNo;
    
    public Contact(Date d,Address ad,String rel,long phnNo,Person per){
        super(per);
        DOB=d;
        address=ad;
        relation=rel;
        phoneNo=phnNo;
    }
    Date getDOB(){
        return DOB;
    }
    Address getAddress(){
        return address;
    }
    String getRelation(){
        return relation;
    }
    double getPhoneNo(){
        return phoneNo;
    }
    
    void setDOB(Date d){
        DOB=d;
    }
    void setAddress(Address ad){
        address=ad;
    }
    void setRelation(String re){
        relation=re;
    }
    void setPhoneNo(int phn){
        phoneNo=phn;
    }
    @Override
    public String toString(){
        return super.toString()+"\nDOB: "+DOB+"\nAddress: "+address+"\nRelation: "+relation+" \nPhone Number: "+phoneNo+"\n+++++++______\n";
    }
}
