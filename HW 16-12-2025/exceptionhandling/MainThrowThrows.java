/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandling;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class MainThrowThrows 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter a number to check it is valid or not : ");
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();
        
        ThrowThrows tt = new ThrowThrows();
        try 
        {
            tt.checkNumber(num);
        } 
        catch (Exception ex) 
        {
            System.out.println("Invalid");
        }
        
    }
  
}
