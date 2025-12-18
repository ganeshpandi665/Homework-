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
public class CircleAreaCalculater 
{
    public final double pi = 3.14;
    public void cal(double radius)
    {
        double circle = pi*(radius*radius);
        System.out.println(circle);
    }    
}
