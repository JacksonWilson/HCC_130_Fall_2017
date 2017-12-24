package assignments.a5;

import java.security.SecureRandom;

public class PasswordGenerator {
    private static final String CHARACTERS = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    private static SecureRandom rand = new SecureRandom();
    private static String randomPassword;

    private PasswordGenerator() {}

    public static void generatePassword() {
        int length = rand.nextInt(101);
        StringBuilder sb = new StringBuilder(length);
        for(int i = 0; i < length; i++) 
            sb.append(CHARACTERS.charAt(rand.nextInt(CHARACTERS.length())));
        randomPassword = sb.toString();
    }

    public static boolean matchCharAt(char val, int idx) {
        return randomPassword.charAt(idx) == val;
    }

    public static boolean matchLength(int l) {
        return randomPassword.length() == l;
    }

    public static boolean matchPasswordAndLength(String p, int l) {
        return matchLength(l) && randomPassword.equals(p);
    }
}