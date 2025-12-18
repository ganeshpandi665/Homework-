/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandling;

import java.util.Scanner;

/**
 *
 * @author Ganesh
 */
public class MainArray 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int ar[]  = new int[5];
        
        for(int i=0;i<ar.length;i++)
        {
            System.out.println("Enter the value for "+i+" index is :");
            ar[i] = sc.nextInt();
            System.out.println();
        }
        
        try
        {
            System.out.println("select the index value you want to see");
            int i = sc.nextInt();
            System.out.println("The Value of "+i+" index is "+ar[i]);
        }
        catch(Exception obj)
        {
            System.out.println("Sorry index limit exceeded");
        }
        
    }
       
}
