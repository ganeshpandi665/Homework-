/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandling;

/**
 *
 * @author Ganesh
 */
public class NestedTry
{
    public void check(int ar[],int index,int num1,int num2)
    {
        try
        {
           System.out.println("Divide value of "+num1+" / "+num2+" is : "+num1/num2);
           try 
           {
               System.out.println("The value of "+index+" index is : "+ar[index]);
           }
           catch(ArrayIndexOutOfBoundsException obj)
           {
               System.out.println("The index is invalid");
           }
        } 
        catch(ArithmeticException obj)
        {
            System.out.println("Soory You entered a wrong number");
        }
    }
    
}
