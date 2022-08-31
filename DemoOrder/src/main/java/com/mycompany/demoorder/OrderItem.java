package com.mycompany.demoorder;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author aftab
 */
public class OrderItem {
    private String upc;
    private int quantity;
    private int price;
    int objects=0;
    
    OrderItem(String code,int quanTT,int price){
        upc=code;
        quantity=quanTT;
        this.price=price;
	objects++;
    }
    
    public int getCost(){
        return price*quantity;
    }
    public String toString(){
        return "upc code: "+upc+"\nQuantity: "+quantity+"\nprice: "+price;
                
    }
}
