/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandling;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ganesh
 */
public class MainAgeCheck 
{
    public static void main(String[] args) 
    {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your Age : ");
            int age = sc.nextInt();
            
            AgeCheck ac = new AgeCheck();
            ac.ageCheck(age);
        } 
        catch (Exception ex) 
        {
            System.out.println("Sorry your age is not valid");
        }
            
    }
}
