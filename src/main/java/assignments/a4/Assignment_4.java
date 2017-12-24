package assignments.a4;

import java.io.IOException;

import utils.KeyboardReader;

public class Assignment_4 {

    public static void main(String[] args) {
        try {
            KeyboardReader keyReader = KeyboardReader.getInstance();
            Troll troll = new Troll(20, true, keyReader.readInt("Enter the Troll\'s hit attack: "), keyReader.readInt("Enter the Troll\'s weapon attack: "));
            Kobold kobold = new Kobold(10, true, keyReader.readInt("Enter the Kobold\'s bite attack: "), keyReader.readInt("Enter the Kobold\'s claw attack: "));

            System.out.println("\nBefore the monsters attack each other\n");
            System.out.println("Troll: " + troll);
            System.out.println("Kobold: " + kobold);

            System.out.println("After the monsters attack each other\n");
            System.out.println("Troll: " + troll);
            System.out.println("Kobold: " + kobold);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}