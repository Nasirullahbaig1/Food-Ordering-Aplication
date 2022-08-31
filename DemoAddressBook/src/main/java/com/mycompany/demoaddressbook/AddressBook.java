/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demoaddressbook;

/**
 *
 * @author aftab
 */
public class AddressBook {
    private Person[] entries=new Person[5];
    
    Person[] getEntries(){
        return entries;
    }
    void personLoader(int loc,String last,String first,String gender){
            entries[loc]=new Person(last,first,gender);
    }
    void contactLoader(int loc,Date d,Address ad,String rel,long phnNo,Person per){
        entries[loc]=new Contact(d,ad,rel,phnNo,per);
    }
    String search(String fName){
        boolean check=false;
        int index=-1;
        
        for(int i=0;i<entries.length;i++){
            if (entries[i]!=null){
                if (fName.equalsIgnoreCase(entries[i].getFName())){
                    check=true;
                    index=i;
                    break;
                }
            }
        }
        if (check)
                return getInfo(index);
        else
            return "not Found";
    }
    
    String getInfo(int i){
        return entries[i].toString();
    }
    String DOBFinder(int month){
        String sameMonthPeople="";
        if(month>=1 && month<=12){
            for (int k=0;k<entries.length;k++){
                if (entries[k]!=null){
                    if(entries[k].getDOB().getMonth()!=100){
                        if (entries[k].getDOB().getMonth()==month)
                            sameMonthPeople+=entries[k].toString()+"\n";
                    }
                }
            }
            
        }
        else
            return "month out of range";
       
        if(!sameMonthPeople.equals(""))
                return sameMonthPeople;
        else
            return "Non of the entries are born in the given month";
    }
}
