/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp4.exercice1;

/**
 *
 * @author MSI
 */
public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(Integer accountNumber, double interestRate) {
        super(accountNumber);
        this.interestRate = interestRate;
    }

    
    public double calculateInterest(){
        return interestRate*balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    @Override
    public void withdraw(double montant){
         if (montant<=200)
         balance-= montant;
         else balance-= (montant*1.1);
     }
}
