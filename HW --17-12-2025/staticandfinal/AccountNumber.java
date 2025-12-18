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
public class AccountNumber 
{
    public final long accountNumber;
    public AccountNumber(long accountNumber) 
    {
        this.accountNumber = accountNumber;
    }
    public void display()
    {
        System.out.println("Account Number : "+accountNumber);
    }
        
}
