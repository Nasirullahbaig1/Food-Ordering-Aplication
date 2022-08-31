/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demoaddressbook;

/**
 *
 * @author aftab
 */
public class Date {
    private int day,month,year;
    Date(int d,int m,int y){
        day=d;
        month=m;
        year=y;
    }
    void setDate(int d,int m,int y){
        day=d;
        month=m;
        year=y;
    }
    int getMonth(){
        return month;
    }
    int[] getDate(){
        int[] temp={day,month,year};
        return temp;
    }
    public String toString(){
        return day+"/"+month+"/"+year;
    }
}
