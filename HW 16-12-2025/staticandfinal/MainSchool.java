/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticandfinal;

import java.util.Scanner;

/**
 *
 * @author Ganesh
 */
public class MainSchool 
{

    
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Student Name : ");
        String student1 = sc.next();
        System.out.print("Enter the Student Name : ");
        String student2 = sc.next();
        System.out.print("Enter the Student Name : ");
        String student3 = sc.next();
        
        School s = new School();
        System.out.println("Student Name : "+student1);
        System.out.println("School Name : "+School.schoolName);
        System.out.println("Student Name : "+student2);
        System.out.println("School Name : "+School.schoolName);
        System.out.println("Student Name : "+student3);
        System.out.println("School Name : "+School.schoolName);
        
        
        
    }
    
}
