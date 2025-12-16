/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string;

import java.util.Scanner;

/**
 *
 * @author Ganesh
 */
public class UpperAndLowerCase
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("press 1 for UpperCase");
        System.out.println("Press 2 for LowerCase");
        int num = sc.nextInt();
        String st = sc.next();
        
       
        UpperAndLowerCase ul = new UpperAndLowerCase();
        String res = ul.upperLower(st, num);
        
        if(num==1)
        {
            System.out.println(res);
        }
        else if(num==2)
        {
            System.out.println(res);
        }
        else
        {
            System.out.println("Invalid");
        }
        
        
    }
    public String upperLower(String st,int num)
    {
       if(num==1)
       {
           return st.toUpperCase();
       }
       else if(num==2)
       {
           return st.toLowerCase();
       }
       return st;    
    }
    
}
