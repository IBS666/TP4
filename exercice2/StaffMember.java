/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp4;

import java.util.List;
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
public class StaffMember extends User{
      private String qualification;
    private Integer experience;
    private List<String> tasks;

    public StaffMember(String qualification, Integer experience, List<String> tasks, String firstName, String lastName, String email, long cin) {
        super(firstName, lastName, email, cin);
        this.qualification = qualification;
        this.experience = experience;
        this.tasks = tasks;
    }
    
    
    
    @Override
    public void  displayInfo(){
        System.out.println("StaffMember{" + "firstName=" + getFirstName() + ", lastName=" + getLastName() + ", email=" + getEmail() + ", cin=" + super.getCin()+", qualification=" + qualification + ", experience=" + experience + ", tasks=" + tasks + '}');
    }
    
    public void updateProfile(String firstName,String lastName,String email,long cin,String qualification,Integer experience,List<String> tasks){
       this.setFirstName(firstName); 
       this.setLastName(lastName);
       this.setEmail(email);
       this.setCin(cin);
       this.qualification=qualification;
       this.experience=experience;
       this.tasks=tasks;
   }
    @Override
    public boolean authenticate(){
       return true;
   }

    public void finishTask(String task){
        this.tasks.remove(task);
    }
    
}

