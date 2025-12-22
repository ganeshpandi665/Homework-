/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntryExit;

/**
 *
 * @author Ganesh
 */
class ArraysList
{
      int value;
    
    ArraysList(int value)
    {
        this.value = value;
    }
    
    void display()
    {
        System.out.println("The value you entered is : "+value);
    }

    int intValue() 
    {
        return value;
    }
}
