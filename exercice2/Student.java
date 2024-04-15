/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.eniso.tp4;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author MSI
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student extends User {
   private  Double average;
   private Classe classe ;
   private Status status ;

    public Student(Double average, Classe classe, Status status, String firstName, String lastName, String email, long cin) {
        super(firstName, lastName, email, cin);
        this.average = average;
        this.classe = classe;
        this.status = status;
    }
   
   
   enum Classe{
       IA1_1 , IA1_2 ,GTE1;
   }
    enum Status{
        REDOUBLANT ,NON_REDOUBLANT;
    }
    
   @Override
    public void  displayInfo(){
        System.out.println("Student{" + "firstName=" + getFirstName() + ", lastName=" + getLastName() + ", email=" + getEmail() + ", cin=" + super.getCin()+", average=" + average + ", status=" + status + ", classe=" + classe + '}' + '}');
       
    }
    public void updateProfile(String firstName,String lastName,String email,long cin, Double average,Classe classe, Status status){
       this.setFirstName(firstName); 
       this.setLastName(lastName);
       this.setEmail(email);
       this.setCin(cin);
       this.average=average;
       this.status=status;
       this.classe=classe;
   }
    public void updateProfile(String firstName,String lastName,String email){
        this.setFirstName(firstName); 
        this.setLastName(lastName);
        this.setEmail(email);
    }
   @Override
    public boolean authenticate(){
       return true;
   }

    

    
 
    
}
