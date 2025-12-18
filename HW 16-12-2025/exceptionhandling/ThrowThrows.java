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
public class ThrowThrows 
{
    public void checkNumber(int num) throws Exception
    {
        if(num>0)
        {
            System.out.println(num+" is a Valid Number");
        }
        else if(num<=0)
        {
            throw new Exception("Number cannot be negative. Please check it.");
        }
    }
}
