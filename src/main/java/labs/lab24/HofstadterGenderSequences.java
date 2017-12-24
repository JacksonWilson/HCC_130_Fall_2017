package labs.lab24;

public class HofstadterGenderSequences {

    public static int female(int n) {
        return n == 0 ? 1 : n - male(female(n - 1));
    }

    public static int male(int n) {
        return n == 0 ? 0 : n - female(male(n - 1));
    }
}