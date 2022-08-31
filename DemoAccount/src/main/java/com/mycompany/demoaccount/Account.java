/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demoaccount;

/**
 *
 * @author aftab
 */
public class Account {
    private double balance;
    
    Account(){
        balance=0;
    }
    Account(double amnt){
        balance=amnt;
    }
    Account(Account ac){
        balance=ac.getBalance();
    }
    double getBalance(){
        return balance;
    }
    void setBalance(double amnt){
        balance=amnt;
    }
    public void deposit(double dep){
        balance+=dep;
    }
    public void withdraw(double with){
        if ((balance-with)<0)
              System.out.println("not enough money!");
        else
            balance-=with;
    }
    
}
