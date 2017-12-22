package labs.lab8;

import java.io.IOException;

import utils.KeyboardReader;

public class Driver {

    public static void main(String[] args) {
        try (KeyboardReader keyReader = new KeyboardReader(System.in)) {
            String input = keyReader.readLine("Enter a line of text below\n");
            System.out.println("\nThe character in position 3 is: " + input.charAt(3));
            System.out.println("The length of your string is: " + input.length());
            System.out.println("Your string with z in place of a is: " + input.replace('a', 'z'));
            System.out.println("Your string in uppercase is: " + input.toUpperCase());
            System.out.println("Your string in lowercase is: "+ input.toLowerCase());
            System.out.println();

            double num = keyReader.readDouble("Enter a floating-point number below\n");
            System.out.println("\nThe largest integer less than " + num + " is " + Math.floor(num));
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}