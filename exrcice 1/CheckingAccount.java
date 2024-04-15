/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp4.exercice1;

/**
 *
 * @author MSI
 */
public class CheckingAccount extends BankAccount{
     private double overdraftAllowed;

    public CheckingAccount(Integer accountNumber, double overdraftAllowed) {
        super(accountNumber);
        this.overdraftAllowed = overdraftAllowed;
    }

    

    public double getOverdraftAllowed() {
        return overdraftAllowed;
    }

    public void setOverdraftAllowed(double overdraftAllowed) {
        this.overdraftAllowed = overdraftAllowed;
    }

     @Override
    public void withdraw(double montant){
        if (montant  <=overdraftAllowed)
         balance-= montant;
        else
            balance-=overdraftAllowed;
     }
     
     
}
