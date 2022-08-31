/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.demoaccount;
import java.util.Scanner;

/**
 *
 * @author aftab
 */
public class DemoAccount {

    public static void main(String[] args) throws InterruptedException {
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter the initial amount to be added into the Savings Account!");
        SavingsAccount acc=new SavingsAccount(input.nextDouble());
        
        int choice;
        while (true){
            System.out.println("The balance in your savings account is: "+acc.getBalance());
            System.out.println("press 1 to deposit more money in your account");
            System.out.println("Press 2 to withdraw money from your account.");
            System.out.println("press 3 to set the default interest rate.\nnpress 4 to apply monthly interest rate!");
            System.out.println("press 5 to exit");
            
            choice=input.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter amount to be depsited\n\n");
                    acc.deposit(input.nextDouble());
                    break;
                case 2:
                     System.out.println("Enter amount to be withdrawn.\n\n");
                     acc.withdraw(input.nextDouble());
                     break;
                case 3:
                    System.out.println("Enter the new default Iterest Rate\n\n");
                    acc.setDefaultInterestRate(input.nextDouble());
                    break;
                case 4:
                    System.out.println("Applying monthly interest!!");
                    acc.applyMonthlyInterestRate();
                    //acc.wait(3000);
                    System.out.println("Done\n\n");
                    break;
                case 5:
                    System.out.println("Bye\n\n");
                    System.exit(0);
                    break;
                    
            }
        }
    }
}
