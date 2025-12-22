/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntryExit;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ganesh
 */
public class ArrayListMain
{
    public static void main(String[] args)
    {
        Scanner Sc = new Scanner(System.in);
        ArrayList<ArraysList> al = new ArrayList<>();
        
        while(true)
        {
            System.out.print("Enter a value 1 for Entry 2 for Exist : ");
            int choice = Sc.nextInt();
            
                if(choice == 1)
                {
                    System.out.print("Enter the value : ");
                    int value = Sc.nextInt();
                    al.add(new ArraysList(value));
                }
                else if(choice == 2)
                {
                    int sum =0;
                    for(ArraysList num:al)
                    {
                        sum = sum+num.intValue();
                        num.display();
                    }
                    System.out.println("Sum of the values are : "+sum);
                    break;
                }
                else
                {
                    System.out.println("Invalid choice...Please check it.");
                }
        }
        Sc.close();
    }
}
    
