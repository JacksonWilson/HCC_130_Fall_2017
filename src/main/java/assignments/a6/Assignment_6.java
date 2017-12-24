package assignments.a6;

import java.io.IOException;

import utils.KeyboardReader;

public class Assignment_6 {

    public static void main(String[] args) {
        try {
            KeyboardReader keyReader = KeyboardReader.getInstance();
            String password = keyReader.readLine("Please enter the password: ");
            while (!Encryption.isValidLength(password)) {
                password = keyReader.readLine("Sorry, the password must be at least " + Encryption.getMinimumLength() + " characters.\nPlease enter a valid password: ");
            }

            String encryptedPassword = Encryption.encrypt(password);
            System.out.println("Encrypted password: " + encryptedPassword);
            System.out.println("Decrypted password: " + Encryption.decrypt(encryptedPassword));
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}