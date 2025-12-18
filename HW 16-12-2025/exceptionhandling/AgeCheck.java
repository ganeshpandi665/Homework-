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
public class AgeCheck
{
    public void ageCheck(int age) throws Exception
    {
        if(age>=18)
        {
            System.out.println("Your age is valid ");
        }
        else
        {
            throw new Exception("Sorry your age is not valid");
        }
    }
}
