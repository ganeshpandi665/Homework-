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
public class MultipleException 
{
    public void exceptions(int num1,int num2)
    {
        try
        {
            int div = num1/num2;
            System.out.println(div);
        }
        catch(ArithmeticException obj)
        {
            System.out.println("Sorry you enter the wrong number");
        }
        finally
        {
            System.out.println("Thank You");
        }
    }
    public void arrayIndex(int ar[],int index)
    {
        try
        {
            System.out.println("The value of "+index+" is :"+ar[index]);
        }
        catch(ArrayIndexOutOfBoundsException obj)
        {
            System.out.println("Sorry , You entered a wrong index. ");
        }
        finally
        {
            System.out.println("Thank You");
        }
    }
}
