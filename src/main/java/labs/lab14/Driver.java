package labs.lab14;

import java.io.IOException;

import utils.KeyboardReader;

public class Driver {

    public static void main(String[] args) {
        try (KeyboardReader keyReader = new KeyboardReader(System.in)) {
            Zoo zoo = new Zoo();
            zoo.getCat().printCharacteristics();
            zoo.getDog().setColor(keyReader.readLine("Enter new dog color: "));
            zoo.getDog().printCharacteristics();
            zoo.getAlligator().eat(zoo.getCat());
            zoo.getAlligator().printCharacteristics();
            zoo.getAlligator().eat(zoo.getDog());
            zoo.getAlligator().printCharacteristics();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}