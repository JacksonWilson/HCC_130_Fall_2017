package labs.lab5;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

import utils.KeyboardReader;

/*
 * Name: Jackson Wilson
 * Attributes: firstName (String), age (int), expectedGrade (char)
 * Behaviors: setters, greetPerson
 */

public class Driver {
    private static KeyboardReader keyReader;

    static {
        keyReader = new KeyboardReader(System.in);
    }

	private String firstName;
	private int age;
	private char expectedGrade;

	public Driver() {
		firstName = "unknown person";
	}

	public Driver(String firstName, int age) {
		setFirstName(firstName);
		setAge(age);
	}

	public final void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setExpectedGrade(char expectedGrade) {
		this.expectedGrade = expectedGrade;
	}

	public final void greetPerson() {
		System.out.print("Hello there " + firstName);
		System.out.println(". Today is " + DateFormat.getDateInstance(
				DateFormat.LONG).format(new Date(System.currentTimeMillis())));

    }

	public static final void main(String[] args) {
        try {
            //get person's name and greet them.
            System.out.println("Please enter your first name.");
            String firstName = keyReader.readLine();
    
            System.out.println("What is your age in years?");
            int age = keyReader.readInt();
    
            Driver demo = new Driver(firstName, age);
    
            System.out.println("What grade do you think you will get in this class?");
            demo.setExpectedGrade(keyReader.readChar());
    
            demo.greetPerson();
            //offer a chance to run again with a new name.
            System.out.println();
            System.out.println("Would you like to change your name (Y/N)?");
    
            char choice = keyReader.readChar();
            if(choice == 'y') {
                System.out.println("Please enter another name.");
                demo.setFirstName(keyReader.readLine());
                demo.greetPerson();
            }
            //we're outa here
            System.out.println();
            System.out.println("Good Bye.");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
	}
}