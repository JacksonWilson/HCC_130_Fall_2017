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
public class PartC {
	public static void main(String [] args) throws IOException {
		long yearToBeTested = 0;

		System.out.println("This program will determine if a particular year is a leap year.");
		System.out.print("Enter the year you want tested:  ");

		Calendar c = new Calendar(KeyboardReader.getInstance().readLong());

		if (c.isLeapYear)
			System.out.println("\n" + c.year + " is a leap year.");
		else
			System.out.println("\n" + c.year + " is not a leap year.");
	}

}