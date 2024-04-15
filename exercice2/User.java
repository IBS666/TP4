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
public class User {
   private String firstName;
   private String lastName;
   private String email;
   private long cin;

   public void  displayInfo(){
       
       System.out.println("User{" + "firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", cin=" + cin + '}');
    }

    public void updateProfile(String firstName,String lastName,String email,long cin){
       this.firstName=firstName;
       this.lastName=lastName;
       this.email=email;
       this.cin=cin;
       
   }
   public boolean authenticate(){
       return true;
   }
  
    
}
