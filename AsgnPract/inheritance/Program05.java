package com.inheritance;

import java.util.Scanner;

/* 
 * Write a class Account with basic details (accountNumber, holderName). Inherit it in a class
 * SavingsAccount which adds interestRate and a method to calculate interest.
 */

import java.util.Scanner;

class Account {
    String accNumber;
    String holderName;
    double balance;
}

class SavingAccount extends Account {
    double interestRate;
    
    SavingAccount(double interestRate, String accNumber, String holderName, double balance) {
        this.interestRate = interestRate;
        this.accNumber = accNumber;
        this.holderName = holderName;
        this.balance = balance;
    }
    
    void calculateInterest() {
        double interest = balance * (interestRate / 100);
        System.out.println("Interest Calculated: " + String.format("%.2f", interest));
        System.out.println("Total Balance with Interest: " + String.format("%.2f", balance + interest));
    }
    
    void showDetails() {
        System.out.println("---------------");
        System.out.println("accNumber : " + accNumber);
        System.out.println("holderName : " + holderName);
        System.out.println("balance : ₹" + String.format("%.2f", balance));
        System.out.println("interestRate : " + interestRate + "%");
    }
}

public class Program05 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        
        System.out.print("Enter Account Number: ");
        String accNumber = ip.nextLine();
        
        System.out.print("Enter Holder Name: ");
        String holderName = ip.nextLine();
        
        System.out.print("Enter Balance: ₹");
        double balance = ip.nextDouble();
        
        System.out.print("Enter Interest Rate (%): ");
        double interestRate = ip.nextDouble();
        
        SavingAccount sa = new SavingAccount(interestRate, accNumber, holderName, balance);
        
        sa.showDetails();
        sa.calculateInterest();
        
        ip.close();
    }
}