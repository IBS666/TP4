/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp4.exercice1;

import java.util.ArrayList;

/**
 *
 * @author MSI
 */
public class Customer {
    private String firstName;
    private String lastName ;
    private ArrayList<BankAccount> accounts=new ArrayList<>();

    public Customer(String firstName, String lastName, ArrayList<BankAccount> accounts) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accounts = accounts;
    }

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
     
    public void  addAccount(BankAccount compte){
        accounts.add(compte);
    } 
    public void  removeAccount(BankAccount compte){
        accounts.remove(compte);
    }
    public double getTotalAccountBalance(){
        double tot=0;
        for (BankAccount acc :accounts){
            tot+= acc.getBalance();
        }
        return tot;
     }
    public void  transferFunds(BankAccount sourceAccount, BankAccount destinationAccount, Double amount){
        sourceAccount.withdraw(amount);
        destinationAccount.deposit(amount);
    }
}
