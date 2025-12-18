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
public class MainMultipleException
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = sc.nextInt();
        
        MultipleException me = new MultipleException();
        me.exceptions(num1, num2);
        System.out.println(" ");
        
        System.out.print("Enter the length of array is :");
        int len = sc.nextInt();
        int ar[] = new int[len];
        
        for(int i=0;i<len;i++)
        {
            System.out.print("Enter a value for "+i+" index :");
            int index = sc.nextInt();
        }
        
        MultipleException me1 = new MultipleException();
        me1.arrayIndex(ar, len);
        
        
    }
}
