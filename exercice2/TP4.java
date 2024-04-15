/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.eniso.tp4;

import com.eniso.tp4.Student.Status;
import com.eniso.tp4.Student.Classe;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MSI
 */

public class TP4 {

    public static void main(String[] args) {
        //EXERCICE 2
     Student student = new Student( 15.0, Classe.IA1_2, Status.NON_REDOUBLANT,"student1", "student1", "student@email.com", 12345L);
     student.displayInfo();
     student.updateProfile("student11", "student11", "john.doe.new@email.com");
     student.displayInfo();
     boolean isAuthenticatedStudent = student.authenticate();
     System.out.println("Student Authentication: " + isAuthenticatedStudent);
     Course mathCourse = new Course("Math", new ArrayList(List.of("Algebra", "Calculus")), 2.0f);
     Course physicsCourse = new Course("Physics", new ArrayList(List.of("Mechanics", "Thermodynamics")),
     1.5f);
     Teacher teacher = new Teacher( 12L, new ArrayList(List.of(mathCourse, physicsCourse)),"teacher1", "teacher1", "teacher1@email.com", 67890L);
     teacher.setHIndex(10L);
     teacher.displayInfo();
     teacher.displayCoursesContent();
     StaffMember staffMember = new StaffMember("Engineer", 5, new ArrayList(List.of("Task1", "Task2", "Task3")),"member1", "member1", "member1@email.com", 11111L);
     staffMember.displayInfo();
     staffMember.finishTask("Task2");
     staffMember.displayInfo();
    }
}
