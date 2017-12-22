package labs.lab13b;

import java.io.IOException;

import utils.KeyboardReader;

public class Driver {
    public static void main(String[] args) {
        try (KeyboardReader keyReader = new KeyboardReader(System.in)) {
            int n = keyReader.readInt("Enter n: ");
            int r = keyReader.readInt("Enter r: ");
            System.out.println("n!: " + CountingTools.factorial(n));
            System.out.println("r!: " + CountingTools.factorial(r));
            System.out.println("The number of permutations of n objects taken r at a time: " + CountingTools.permutation(n, r));
            System.out.println("The number of combinations of n objects taken r at a time: " + CountingTools.combination(n, r));
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}