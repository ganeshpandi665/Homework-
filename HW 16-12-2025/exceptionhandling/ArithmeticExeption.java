/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandling;

import static javax.management.Query.div;

/**
 *
 * @author Ganesh
 */
public class ArithmeticExeption 
{
    int div;
    
    public static void divide(int num1,int num2)
    {
        try
        {
        int div = num1/num2;
        System.out.println(div);
        }
        catch(Exception obj)
        {
            System.out.println("The number is divided by zero");
        }
    }
}
