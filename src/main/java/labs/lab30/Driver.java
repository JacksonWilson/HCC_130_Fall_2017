package labs.lab30;

import java.io.IOException;
import java.util.ArrayList;

import utils.KeyboardReader;

public class Driver {

    public static void main(String[] args) {
        try {
            KeyboardReader keyReader = KeyboardReader.getInstance();

            Book[] library = new Book[keyReader.readPositiveInt("Enter number of books: ")];
            for (int i = 0; i < library.length; i++) {
                System.out.println("Enter data for book #" + (i + 1) + " of " + library.length);
                ArrayList<String> chapterTitles = new ArrayList<>();
                System.out.println("Enter chapter titles:");

                String ct;
                while (!(ct = keyReader.readLine(": ")).isEmpty()) {
                    chapterTitles.add(ct);
                }

                library[i] = new Book(keyReader.readLine(), keyReader.readLine(), (String[])chapterTitles.toArray());

                System.out.println();
            }

            System.out.println("Books in the library");
            System.out.println("--------------------");
            for (Book b : library) {
                System.out.println(b + "\n");
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}