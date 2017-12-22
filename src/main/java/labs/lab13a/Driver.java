package labs.lab13a;

import java.io.IOException;

import utils.KeyboardReader;

public class Driver {
    public static void main(String[] args) {
        try (KeyboardReader keyReader = new KeyboardReader(System.in)) {
            double weight = keyReader.readDouble("Enter turtle weight: ");
            System.out.print("Enter turtle age: ");
            long age = keyReader.readLong();
            char gender = keyReader.readChar("Enter gender: ", 'M', 'm', 'F', 'f');

            Turtle turtle = new Turtle(weight, age, gender);
            turtle.printVitals();
            turtle.printClassification();
            System.out.println("GENDER: " + turtle.gender);
            
            turtle.grow(1100.0);
            turtle.printVitals();
            turtle.grow(1100L);
            turtle.printVitals();
            turtle.grow(1100.0, 1100L);
            turtle.printVitals();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}