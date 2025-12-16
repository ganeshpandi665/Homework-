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
public class VowelsCount 
{
    public static void main(String [] args) 
    {
       VowelsCount vc = new VowelsCount();
        System.out.println(vc.vowelsCount("Virat Kohli"));
    }
    public int vowelsCount(String word)
    {
        int count=0;
        for(int i=0;i<word.length();i++)
        {
            char ch = Character.toLowerCase(word.charAt(i));
            switch(ch)
            {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                count++;
                break;
                
            }
        }
        return count;
    }
    
}
