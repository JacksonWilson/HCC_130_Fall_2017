package labs.lab9;

import java.io.IOException;

import utils.KeyboardReader;

public class Driver {

    public static void main(String[] args) {
        try (KeyboardReader keyReader = new KeyboardReader(System.in)) {
            int num = keyReader.readInt("Enter an integer: ");
            System.out.println("Octal: " + Integer.toOctalString(num));
            System.out.println("Hexadecimal: " + Integer.toHexString(num));
            System.out.println("Index of first 1 in binary: " + Integer.toBinaryString(num).indexOf('1'));
            System.out.println("Index of last 1 in binary: " + Integer.toBinaryString(num).lastIndexOf('1'));
            System.out.println();

            String octNum = keyReader.readLine("Enter octal integer: ");
            System.out.println("Decimal: " + Integer.parseInt(octNum, 8));
            System.out.println();

            String hexNum = keyReader.readLine("Enter hexadecimal integer: ");
            System.out.println("Decimal: " + Integer.parseInt(hexNum, 16));
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}