package labs.lab6b;

import java.io.IOException;

import utils.KeyboardReader;

/*
If 2 is entered the output will be: 33.49333333333333
There is no need for the import statement because java.lang.* is already imported by default.
The output is incorrect because (4/3) is integer division.
*/
public class PartA {
	private static KeyboardReader keyReader;

    static {
        keyReader = new KeyboardReader(System.in);
	}
	
	public static void main(String args[]) throws IOException {
		Sphere s;
		double rad = 0;

		System.out.println("Enter the radius of a sphere in cubic cm:  ");
		rad = keyReader.readDouble();

		s = new Sphere(rad);

		System.out.println("There volume of your sphere is:  " + s.getVolume());
	}
}