/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string;

/**
 *
 * @author Ganesh
 */
public class Concat
{
    public static void main(String[] args) 
    {
        String name1 = "Sachin";
        String name2 = "Tendulker";
        String name = name1.concat((" ").concat(name2));
        System.out.println(name);
    }
}
