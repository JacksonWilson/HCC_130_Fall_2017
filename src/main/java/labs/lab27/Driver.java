package labs.lab27;

import java.io.IOException;

import utils.KeyboardReader;

public class Driver {

    public static void main(String[] args) {
        try {
            KeyboardReader keyReader = KeyboardReader.getInstance();

            Ogre[] ogres = new Ogre[keyReader.readPositiveInt("Enter the number of ogres: ")];
            for (int i = 0; i < ogres.length; i++) {
                System.out.println("Enter data for Ogre #" + i + " of " + ogres.length);
                ogres[i] = new Ogre(keyReader.readInt("Number of bones crushed: "),
                                        keyReader.readInt("Number of people eaten: "),
                                        keyReader.readLine("Ugliness description: "));
                System.out.println();
            }

            for (Ogre o : ogres) {
                o.crushPerson();
                o.eatPerson();
                System.out.println(o);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}