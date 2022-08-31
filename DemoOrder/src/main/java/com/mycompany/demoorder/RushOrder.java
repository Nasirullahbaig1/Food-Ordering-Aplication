package com.mycompany.demoorder;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author aftab
 */
public class RushOrder extends Order{
    private int deliveryDay;
    
    RushOrder(){
	super(0);
        deliveryDay=0;
    }
    RushOrder(int items,int deliveryDay){
        super(items);
        this.deliveryDay=deliveryDay;
        
    }
    RushOrder(int items){
        super(items);
    }

    void setDeliveryDay(int day){
	deliveryDay=day;
	}
    @Override
    public int getTotal(){
        if (super.getTotal()>0){
            if (deliveryDay==1)
                return super.getTotal()+25;
            else if (deliveryDay==2)
                return super.getTotal()+15;
            else if (deliveryDay==3)
                return super.getTotal()+10;
            else if (deliveryDay>=4)
                return super.getTotal();
            else
                return -1;
        }
        else
            return 0;
    }
}