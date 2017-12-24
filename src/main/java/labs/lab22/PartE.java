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
public class PartE {
	public static void main(String [] args) throws IOException {
		int val = KeyboardReader.getInstance().readInt("Enter 1, 11, 36, or -17:  ");
		// switch(val) {
		// case 1:
		// 	System.out.println("You entered 1");
		// 	break;
		// case 11:	
		// 	System.out.println("You entered 11");
		// 	break;
		// case 36:
		// 	System.out.println("You entered 36");
		// 	break;
		// case -17:
		// 	System.out.println("You entered -17");	
		// 	break;
		// default:
		// 	System.out.println("You did not enter 1, 11, 36, or -17");
		// }
		if (val == 1 || val == 11 || val == 36 || val == -17)
			System.out.println("You entered " + val);
		else
			System.out.println("You did not enter 1, 11, 36, or -17");
	}		
}
