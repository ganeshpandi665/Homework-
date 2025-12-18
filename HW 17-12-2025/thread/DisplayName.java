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
public class DisplayName extends Thread
{
    String name[];
    DisplayName(String name[])
    {
        this.name = name;
    }
    
    @Override
    public void run()
    {
        for(int i=0;i<name.length;i++)
        {
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException obj)
            {
                System.out.println("Sleep Interrupted");
            }
            System.out.println(name[i]);
        }
    }
}
