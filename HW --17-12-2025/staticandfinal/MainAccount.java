/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticandfinal;

/**
 *
 * @author Ganesh
 */
public class MainAccount 
{
    public static void main(String[] args)
    {
        AccountNumber an = new AccountNumber(6766923399l);
        an.display();
        AccountNumber a = new AccountNumber(6766923368l);
        a.display();
        
        
    }
}
