package com.mycompany.demoorder;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

//package com.mycompany.demoorder;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author aftab
 */
public class DemoOrder {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Random rand=new Random();
        int deliveryDays;
        String upc;
        OrderItem items;
        int subTotl=0;
        int totl=0;
        
        Order[] orders=new Order[4];
        for(int i=0;i<orders.length;i++){
            if(i==0)
                orders[0]=new Order(1);
            else
                orders[i]=new RushOrder(1);
        }
        
        while (true){
            deliveryDays=rand.nextInt(1,7);
            
            System.out.println("Enter upc code of an item to put it to order or enter "
                    + "\"done\" to finish the order");
            upc=in.nextLine();
	    //in.nextLine();
            
            if(upc.equalsIgnoreCase("Done"))
                 break;
            else{
                if (deliveryDays>=4){                
                    System.out.println("Enter amount of this particular QuanTT");
                    orders[0].addOrderItem(new OrderItem(upc,in.nextInt(),rand.nextInt(50,100)));
		    in.nextLine();
                }
                else if (deliveryDays==3){
		    orders[3].setDeliveryDay(3);
                    System.out.println("Enter amount of this particular QuanTT");
                    orders[3].addOrderItem(new OrderItem(upc,in.nextInt(),rand.nextInt(50,100)));
		    in.nextLine();		                  
                }
                else if (deliveryDays==2){
		    orders[2].setDeliveryDay(2);
                    System.out.println("Enter amount of this particular QuanTT");
                    orders[2].addOrderItem(new OrderItem(upc,in.nextInt(),rand.nextInt(50,100)));
		    in.nextLine();
                }
                else if (deliveryDays==1){
		    orders[1].setDeliveryDay(1);
                    System.out.println("Enter amount of this particular QuanTT");
                    orders[1].addOrderItem(new OrderItem(upc,in.nextInt(),rand.nextInt(50,100)));
		    in.nextLine();
                }
            }   
        }
        
        System.out.println("\n\n---------------------\nThe following are Details of All the order item\n----------------");
        for(int i=0;i<orders.length;i++){
            
            if (i==0){
		if(orders[0].getOrder()[0]!=null){
			System.out.println("The following are the individual details of Non Rush orders.");
                	for(int j=0;j<(orders[0].getOrder()).length;j++){
		    		if(orders[0].getOrder()[j]!=null){
                    		System.out.println((orders[0].getOrder())[j].toString());
		    	
				}
                	}             
                	System.out.println("Ther total of non Rush orders is: "+orders[0].getTotal()+"\n++++++++++++++++++++\n");
		}
		else
			System.out.println("there are no NON RUSH orders"+"\n++++++++++++++++++++\n");
		
    
            }
            else if(i==1){
		if(orders[1].getOrder()[0]!=null){
                	System.out.println("The following are the individual details of items that must be delivered within 1 day");
                	for(int j=0;j<orders[1].getOrder().length;j++){
		    		if(orders[1].getOrder()[j]!=null)
                    		System.out.println(orders[1].getOrder()[j].toString());
                	}
                	System.out.println("Ther total of Rush orders that must be delivered within 1 days are: "+orders[1].getTotal()+"\n++++++++++++++++++++\n");
		}
		else
			System.out.println("There are NO ORDERS with delivery Days equal to 1"+"\n++++++++++++++++++++\n");
            }
            else if (i==2){
                
		if(orders[2].getOrder()[0]!=null){
			System.out.println("The following are the individual details of items that must be delivered within 2 days");
                	for(int j=0;j<orders[2].getOrder().length;j++){
		    		if (orders[2].getOrder()[j].toString()!=null)
                    		System.out.println(orders[2].getOrder()[j].toString());
                	}
		
                	System.out.println("Ther total of Rush orders that must be delivered within 2 days are: "+orders[2].getTotal()+"\n++++++++++++++++++++\n");
		}
		else
			System.out.println("There are NO ORDERS with delivery Days equal to 2"+"\n++++++++++++++++++++\n");
            }
            else if (i==3){
                
		if(orders[3].getOrder()[0]!=null){
			System.out.println("The following must be delivers within 3 days");
                	for(int j=0;j<orders[3].getOrder().length;j++){
		    		if(orders[3].getOrder()[j].toString()!=null)
                    		System.out.println(orders[3].getOrder()[j].toString());
                		}                    
                	System.out.println("Ther total of Rush orders that must be delivered within 3 days are: "+orders[3].getTotal()+"\n++++++++++++++++++++\n");
		}
		else
			System.out.println("There are NO ORDERS with delivery Days equal to 3"+"\n++++++++++++++++++++\n");

                
            }
       }
        
        for (int i=0;i<orders.length;i++){
		if(orders[i].getOrder()[0]!=null)
                	totl+=orders[i].getTotal();
        }
        System.out.println("-------------------------------\n\nThe total of ALL the orders is: "+totl+"\n\n----------------\n\n");
    }
}
