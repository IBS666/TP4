/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp4.exercice1;

/**
 *
 * @author MSI
 */
public class BankAccount {
    protected Integer accountNumber;
    protected double balance=0.0;

    public BankAccount(Integer accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public BankAccount(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

   
    
     
     
     public void deposit(double montant){
         balance+= montant;
     }
     
     public void withdraw(double montant){
         balance-= montant;
     }
     
     public double getBalance(){
         return balance;
     }
}
