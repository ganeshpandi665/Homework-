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
public class NumberFormat 
{
    public void number(String input)
    {
        try
        {
           int n = Integer.parseInt(input);
           System.out.println("Number You Entered is : "+input);
        }
        catch(NumberFormatException obj)
        {
            System.out.println("You entered a invalid input, Please enter a correct numeric data");
        }
           
    }
}
