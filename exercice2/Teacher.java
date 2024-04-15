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
public class Teacher extends User {
    private long hIndex;
    private List<Course> courses;

    public Teacher(long hIndex, List<Course> courses, String firstName, String lastName, String email, long cin) {
        super(firstName, lastName, email, cin);
        this.hIndex = hIndex;
        this.courses = courses;
    }

    
    
    @Override
     public void  displayInfo(){
        System.out.println("Teacher{" + "firstName=" + getFirstName() + ", lastName=" + getLastName() + ", email=" + getEmail() + ", cin=" + super.getCin() +", hIndex=" + hIndex + ", courses=" +this.displayCourses()+'}');
    }

   public void updateProfile(String firstName,String lastName,String email,long cin,long hIndex, List<Course> courses){
       this.setFirstName(firstName);
       this.setLastName(lastName);
       this.setEmail(email);
       this.setCin(cin);
       this.hIndex=hIndex;
       this.courses=courses;
   }
    @Override
   public boolean authenticate(){
       return true;
   }

   
   public void displayCoursesContent(){
       for (Course course : courses) {
      System.out.print(course.getName()+":") ;   
      System.out.println(course.getContents());
      
    }
   }

   private String displayCourses(){
       String str="";
        for (Course course : courses) {
           str=str+ course.getName()+", ";
        }
        return str;
    }
    

   

   
}
