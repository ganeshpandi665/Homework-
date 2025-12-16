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
public class Reverse 
{
    public static void main(String[] args) 
    {
       Reverse rs = new Reverse();
        System.out.println(rs.reverse("Virat Kohli"));
    }
    public String reverse(String st)
    {
        String rev = "";
        for(int i=st.length()-1;i>=0;i--)
        {
            rev = rev+st.charAt(i);
        }
        return rev;
    }
}
