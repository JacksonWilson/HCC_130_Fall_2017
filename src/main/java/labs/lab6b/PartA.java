package labs.lab6b;

import java.io.IOException;

import utils.KeyboardReader;

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