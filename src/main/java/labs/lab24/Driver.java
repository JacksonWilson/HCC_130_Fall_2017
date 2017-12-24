package labs.lab24;

import java.io.IOException;

import utils.KeyboardReader;

public class Driver {

    public static void main(String[] args) {
        try {
            int numElements = KeyboardReader.getInstance().readInt("Enter the number of elements to be displayed: ");
            while (numElements < 1)
                numElements = KeyboardReader.getInstance().readInt("Invalid entry. The number of elements must be at least one, please try again: ");
            
            System.out.println("Female\t\tMale");
            System.out.println("--------------------------------");
            for (int i = 1; i <= numElements; i++)
                System.out.println(HofstadterGenderSequences.female(i) + "\t\t\t" + HofstadterGenderSequences.male(i));
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}