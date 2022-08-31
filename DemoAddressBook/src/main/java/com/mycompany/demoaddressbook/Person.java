package com.mycompany.demoaddressbook;

public class Person {
    private String lName,fName,fullName,gender;
    
    Person(String last,String first,String gen){
        lName=last;
        fName=first;
        gender=gen;
        
    }
    Person(Person per){
        lName=per.getLName();
        fName=per.getFName();
        gender=per.getGender();
    }
    
    void setName(String first,String last){
        fName=first;
        lName=last;
        fullName=fName+lName;
    }
    String getName(){
        return fullName;
    }
    String getFName(){
        return fName;
    }
    String getLName(){
        return lName;
    }
    String getGender(){
        return gender;
    }
    Date getDOB(){
        Date d=new Date(100,100,100);
        return d;
    }
    public String toString(){
        return fName+" "+lName+"\n"+gender;
    
    }
}
