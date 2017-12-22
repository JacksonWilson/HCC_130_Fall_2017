package labs.lab6b;

import java.io.IOException;

import utils.KeyboardReader;

/*
If 2 and 3: 6
If 2 and 100: -56
The fix is to use a larger integer type.
*/
public class PartB {
	private static KeyboardReader keyReader;

    static {
        keyReader = new KeyboardReader(System.in);
	}
	
	public static void main(String args[]) throws IOException {
		byte b1 = 0, b2 = 0;
		int product;

		System.out.print("Enter a value for b1:  ");
		b1 = keyReader.readByte();

		System.out.print("Enter a value for b2:  ");
		b2 = keyReader.readByte();

		product = (int)(b1 * b2);

		System.out.println("The product of the 2 numbers entered is:  " + product);
	}
}