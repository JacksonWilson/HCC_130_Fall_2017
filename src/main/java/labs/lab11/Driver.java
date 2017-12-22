package labs.lab11;

import java.io.IOException;

import utils.KeyboardReader;

/*
 * Author:       Todd Simeone

 * Name:         Jackson Wilson
 *
 * Date Written:  1/16/2003
 * 
 * Date Modified: 12/21/2017
 * 
 * Description:   The Driver class is part of a minimal 
 *                application that allows the user to enter
 *                data and work with a Rectangle
 */

public class Driver {
	public static void main(String args[]) {
		try (KeyboardReader keyReader = new KeyboardReader(System.in)) {
			Person user = new Person(keyReader.readLine("Your name: "));
			
			System.out.println("\nHello " + user.getName() + ",");
			System.out.println("You can enter the dimensions of a rectangle.");
			System.out.println("The area of the rectangle will then be calculated");
			System.out.println("and displayed.\n");
			
			double len = keyReader.readDouble("Enter the length of the rectangle: ");
			double wid = keyReader.readDouble("Enter the width of the rectangle: ");
			Rectangle r = new Rectangle(len, wid);
			
			System.out.println("\nThe area of the rectangle is:  " + r.getArea() + "\n");

			double radius = keyReader.readDouble("Enter the radius of the circle: ");
			Circle c = new Circle(radius);

			System.out.println("\nThe area of the circle is: " + c.getArea());
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
