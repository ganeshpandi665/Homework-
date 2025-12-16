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
public class Pallindrome
{
    public static void main(String[] args) 
    {
        String st = "Json";
        Pallindrome pm = new Pallindrome();
        String rev = pm.check(st);
        
        if(st.equals(rev))
        {
            System.out.println(st+" is a Pallindrome");
        }
        else
        {
            System.out.println(st+" is not a Pallindrome");
        }
        
    }
    public String check(String st)
    {
        String rev = "";
        for(int i=st.length()-1;i>=0;i--)
        {
            rev=rev+st.charAt(i);
        }
        return rev;
    }
}
