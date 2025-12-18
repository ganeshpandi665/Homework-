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
public class MainNestedTryCatch
{
    public static void main(String[] args) 
    {
        int ar[] = {20,24,28,30,31,40,45};
        int index = 4;
        int num1 = 20;
        int num2 = 0;
        
        NestedTry nt = new NestedTry();
        nt.check(ar, index, num1, num2);
    }
}
