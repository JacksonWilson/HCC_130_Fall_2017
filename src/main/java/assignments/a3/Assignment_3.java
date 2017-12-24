package assignments.a3;

import java.io.IOException;

import utils.KeyboardReader;

public class Assignment_3 {

    public static void main(String[] args) {
        try {
            Polynomial poly = new Polynomial();
            poly.displaySelf();
            System.out.println();
            double n = KeyboardReader.getInstance().readDouble("Enter the function argument: ");
            System.out.println("f(" + n + ") = " + poly.functionValue(n));
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}