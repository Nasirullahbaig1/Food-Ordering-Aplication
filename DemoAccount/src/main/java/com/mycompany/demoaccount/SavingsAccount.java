/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demoaccount;

/**
 *
 * @author aftab
 */
public class SavingsAccount extends Account{
    private double defaultInterestRate=2.5;
    private double interestRate;
    
    SavingsAccount(double balance){
        super(balance);
        interestRate=0;
    }
    
    void setDefaultInterestRate(double intrst){
        defaultInterestRate=intrst;
    }
    
    void applyMonthlyInterestRate(){
        setBalance(getBalance()-(getBalance()*defaultInterestRate)/100);
    }
}
