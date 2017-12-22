package labs.lab10;

import java.io.IOException;

import utils.KeyboardReader;

public class Driver {
    public static void main(String[] args) {
        try (KeyboardReader keyReader = new KeyboardReader(System.in)) {
            int length = keyReader.readInt("Enter length: ");
            int sharpness = keyReader.readInt("Enter sharpness: ");
            int cut = keyReader.readInt("Enter cut length: ");

            Paper paper = new Paper(length);
            Scissors scissors = new Scissors(sharpness);
            scissors.cutPaper(paper, cut);

            paper.printInformation();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}