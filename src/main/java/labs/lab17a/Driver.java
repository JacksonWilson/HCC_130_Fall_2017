package labs.lab17a;

import java.io.IOException;

import utils.KeyboardReader;

public class Driver {
    public static void main(String[] args) {
        try (KeyboardReader keyReader = new KeyboardReader(System.in)) {
            Fish f1 = new Fish(keyReader.readInt("Enter weight for the first fish: "));
            Fish f2 = new Fish(keyReader.readInt("Enter weight for second fish: "));
            Fish f3 = new Fish(keyReader.readInt("Enter weight for thrid fish: "));
            Fish f4 = new Fish(keyReader.readInt("Enter weight for fourth fish: "));

            System.out.println("\nStarting out with " + Fish.getNumFishAlive() + " fish alive.\n");

            f1.eat(f2);
            System.out.println("There are now " + Fish.getNumFishAlive() + " fish alive.\n");
            f3.eat(f4);
            System.out.println("There are now " + Fish.getNumFishAlive() + " fish alive.\n");
            f3.eat(f1);
            System.out.println("There are now " + Fish.getNumFishAlive() + " fish alive.\n");

            System.out.println(f1);
            System.out.println(f2);
            System.out.println(f3);
            System.out.println(f4);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}