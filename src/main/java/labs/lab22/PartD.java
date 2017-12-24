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
public class PartD {
	public static void main(String [] args) throws IOException {
		long a = KeyboardReader.getInstance().readLong(1, 2, "Enter the number 1 or 2:  ");
		long z = 17;
		if (a == 1)
			z = 13;
		
		System.out.println("The contents of z:  " + z);	
	}		
}