/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.demoaddressbook;
import java.util.Scanner;

/**
 *
 * @author aftab
 */
public class DemoAddressBook {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int choice,alter;
        String fName,lName,gender,street,city,state,zip,relation="";
        int day,month,year;
        long phoneNo;
        AddressBook booklet=new AddressBook();
        
        System.out.println("\n\n----------------------------------\nThis Address book can contain ONLY 5 entries!\n-----------------------------------------------\n");
        for(int i=0;i<booklet.getEntries().length;i++){            
            
            
            while(true){
                System.out.println("Enter 1 to add a PERSON\nEnter 2 to add a CONTACT\nEnter 3 to end the list");
                try{
                    choice=in.nextInt();
                    break;
                }
                catch(Exception e)   {
                    System.out.println("\n-------\nEnter an integer\n------\n");
                    in.nextLine();
                }
            }
            in.nextLine();
            
            if(choice==1){
                System.out.println("\n\nEnter first Name");
                fName=in.nextLine();
                System.out.println("Enter last Name");
                lName=in.nextLine();
                System.out.println("Enter Gender");
                gender=in.nextLine();
                booklet.personLoader(i, lName, fName, gender);
            }
            else if(choice==2){
                System.out.println("\nEnter first Name");
                fName=in.nextLine();
                System.out.println("Enter last Name");
                lName=in.nextLine();
                System.out.println("Enter Gender");
                gender=in.nextLine();
                
                System.out.println("\nEnter the street of "+fName); 
                street=in.nextLine();
                System.out.println("Enter city of "+fName);
                city=in.nextLine();
                System.out.println("Enter state of "+fName);
                state=in.nextLine();
                System.out.println("Enter zip code of "+fName);
                
                zip=in.nextLine();
                while(true){
                    System.out.println("\nPress 1 if "+fName+" is your family member Press 2 if "+fName+" is your FRIEND Press 3 if "+fName+" is your Business Assossiate");
                    try{
                        switch (in.nextInt()){
                            case 1:
                                relation="FAMILY MEMBER";
                                break;
                            case 2:
                                relation="FRIEND";
                                break;
                            case 3:
                                relation="BUSINESS ASSOSSIATE";                 
                        }
                        break;
                    }
                    catch(Exception e){
                        System.out.println("\n-------\nEnter a valid INTEGER input\n------------\n");
                        in.nextLine();
                    }
                }
                while(true){
                    try{
                        System.out.println("\nEnter Day of Birth");
                        day=in.nextInt();
                        break;
                    }
                    catch(Exception e){
                        System.out.println("\n-------\nEnter a valid INTEGER input\n------------\n");
                        in.nextLine();
                    }
                }
                while (true){
                    try{
                        System.out.println("Enter month of Birth");
                        month=in.nextInt();
                        break;
                    }
                    catch(Exception e){
                        System.out.println("\n-------\nEnter a valid INTEGER input\n------------\n");
                        in.nextLine();
                    }
                    
                }
                while(true){
                    try{
                        System.out.println("Enter year of Birth");
                        year=in.nextInt();
                        break;
                    }
                    catch(Exception e){
                        System.out.println("\n-------\nEnter a valid INTEGER input\n------------\n");
                        in.nextLine();
                    }        
                }
                while(true){
                    try{
                        System.out.println("Enter PHONE NO of "+fName);
                        phoneNo=in.nextLong();
                        break;
                    }
                    catch(Exception e){
                        System.out.println("\n-------\nEnter a valid INTEGER input\n------------\n");
                        in.nextLine();
                    }
                }
                while(true){
                    try{
                        booklet.contactLoader(i, new Date(day,month,year),new Address(street,city,state,zip), relation,phoneNo,new Person(lName, fName, gender));
                        break;
                    }
                    catch(Exception e){
                        System.out.println("\n-------\nEnter a valid INTEGER input\n------------\n");
                        in.nextLine();
                    }
                }    
                
                in.nextLine();
            }
            else if (choice==3){
                System.out.println("--------------------\nYou entered "+(i)+" Elements to this Address BOOk\n\n---------------------------");
                break;
            }
        }
        
        while(true){
            while(true){
                System.out.println("""
                                       Enter 1 to search a PERSON or CONTACT by first Name
                                       Enter 2 to search for people born in a particular month
                                       Enter 3 to exit the program""");
                try{         
                    alter=in.nextInt();
                    break;
                }
               catch(Exception e){
                        System.out.println("\n-------\nEnter a valid INTEGER input\n------------\n");
                        in.nextLine();
                    } 
            }
            in.nextLine();
            if (alter==1){
                System.out.println("Enter first name of a PERSON or CONTACT to get its info");
                System.out.println("\n\nFollowing is the gathered info.\n"+booklet.search(in.nextLine())+"\n");
            }
            else if (alter==2){
                while(true){
                    System.out.println("Enter a month to find the people born in that month");
                    try{
                        System.out.println("\n\nThe following have the same birth MONTH\n"+booklet.DOBFinder(in.nextInt()));
                        break;
                    }
                    catch(Exception e){
                            System.out.println("\n-------\nEnter a valid INTEGER input\n------------\n");
                            in.nextLine();
                        }
                }
            }
            else if (alter==3){
                System.out.println("\n\n------------------------------------\nBye\n-----------------------------------------------------");
                break;
            }
        }
    }
}
