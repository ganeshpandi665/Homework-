/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DisplayOutput;

/**
 *
 * @author Ganesh
 */
public class Display3 implements Runnable
{
    String message = "Sure, Java is a programming language, Which is used for develop applications with platform independent";
    
    @Override
    public void run()
    {
        for(int i =0;i<message.length();i++)
        {
            char ch = message.charAt(i);
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException obj)
            {
                System.out.println("Thread interrupted");
            }
            finally
            {
                System.out.print(ch);
            }
        }
        System.out.println();
    }

    
}
