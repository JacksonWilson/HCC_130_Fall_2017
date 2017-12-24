package labs.lab25;

import java.util.Arrays;

public class Driver {

    public static void main(String[] args) {
        char[] alphabet = new char[26];

        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = (char)(i + 'a');
        }

        for (char c : alphabet) {
            System.out.println(c);
        }
        
        {
            int i = alphabet.length;
            while (i >= 0)
                System.out.println(alphabet[i--] + " ");
        }

        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = Character.toUpperCase(alphabet[i]);
        }
        
        for (char c : alphabet) {
            System.out.println(c);
        }
        
        char average = 0;
        for (char c : alphabet) {
            average += c;
        }
        average /= alphabet.length;
        System.out.println("Unicode value: " + (int)average);
        System.out.println("Unicode character: " + average);
    }
}