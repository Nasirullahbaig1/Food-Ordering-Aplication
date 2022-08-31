package com.mycompany.demoorder;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author aftab
 */
public class Order {
    private int index;
    OrderItem[] orders;
            
    public Order(int ordrs){
        orders=new OrderItem[ordrs];
        index=0;
    }
    
    void addOrderItem(OrderItem or){
        if(index>=orders.length){
            OrderItem[] temp=new OrderItem[1+orders.length];
            for(int i=0;i<orders.length;i++){
                temp[i]=orders[i];
            }
            orders=temp;
            orders[index]=or;
            index++;
        }
        else{
            orders[index]=or;
            index++;
        }
    }
    OrderItem[] getOrder(){
        return orders;
    }
    int getTotal(){
        int totl=0;
        for (OrderItem i: orders){
            totl+=i.getCost();
        }
        return totl;
    }
    public String printOrderItems(){
        String info="";
        for(OrderItem i:orders){
	    if (i.toString()!=null){
	    String temp=i.toString();
            temp=temp+info;
	    info=temp;
	    }
	    else
		continue;
            
        }
        return info;
    }
    void setDeliveryDay(int day){
	System.out.println("this has to be overridden in Rush Delivery");
    }
}
