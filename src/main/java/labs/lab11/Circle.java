package labs.lab11;

/*
 * Author:       Jackson Wilson

 * Name:         Jackson Wilson
 *
 * Date Written:  12/21/2017
 * 
 * Date Modified: 12/21/2017
 */

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    
    public double getArea() {
        return Math.PI * radius * radius;
    }
}