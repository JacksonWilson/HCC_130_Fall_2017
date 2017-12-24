package assignments.a6;

public class Encryption {
    private static final int[] ENCRYPT_PERMUTATION = {2, 9, 3, 4, 6, 8, 1, 0};
    private static final int[] DECRYPT_PERMUTATION = {0, 1, 8, 6, 4, 3, 9, 2};
    private static final int MINIMUM_LENGTH = 10;

    public static String encrypt(String password) {
        if (!isValidLength(password))
            return password;

        char[] passwordChars = password.toCharArray();
        for (int i = 0; i < ENCRYPT_PERMUTATION.length - 1; i++) {
            passwordChars[ENCRYPT_PERMUTATION[i + 1]] = password.charAt(ENCRYPT_PERMUTATION[i]);
        }
        passwordChars[ENCRYPT_PERMUTATION[0]] = password.charAt(ENCRYPT_PERMUTATION[ENCRYPT_PERMUTATION.length - 1]);

        return new String(passwordChars);
    }

    public static String decrypt(String encryptedPassword) {
        if (!isValidLength(encryptedPassword))
            return encryptedPassword;

        char[] passwordChars = encryptedPassword.toCharArray();
        for (int i = 0; i < DECRYPT_PERMUTATION.length - 1; i++) {
            passwordChars[DECRYPT_PERMUTATION[i + 1]] = encryptedPassword.charAt(DECRYPT_PERMUTATION[i]);
        }
        passwordChars[DECRYPT_PERMUTATION[0]] = encryptedPassword.charAt(DECRYPT_PERMUTATION[DECRYPT_PERMUTATION.length - 1]);

        return new String(passwordChars);
    }

    public static boolean isValidLength(String password) {
        return password.length() >= MINIMUM_LENGTH;
    }

    public static int getMinimumLength() {
        return MINIMUM_LENGTH;
    }
}