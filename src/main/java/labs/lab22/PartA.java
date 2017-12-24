package labs.lab22;

import java.io.IOException;

import utils.KeyboardReader;

/*
 * Name: Jackson Wilson
 *
 * Date: 12/23/17
 *
 * Assignment Number: 22
 *
 * Instructor: Todd Simeone
 */
public class PartA {
	public static void main(String [] args) throws IOException {
		long number = KeyboardReader.getInstance().readLong("Enter a number:  ");
		
		if (number > 100000) {
			System.out.println("That is a big number!");
			System.out.println("Big numbers must have at least 6 digits");
		}
		else
			System.out.println("That is not a big number.");
	}		
}