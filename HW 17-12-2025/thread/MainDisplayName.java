/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

/**
 *
 * @author Ganesh
 */
public class MainDisplayName 
{

  
    public static void main(String[] args)
    {
        String name[]= {"Diwakar","Karthik","Rajesh","Sathish","Surya"};
        
        DisplayName dn = new DisplayName(name);
        dn.start();
        
        
    }
    
}
