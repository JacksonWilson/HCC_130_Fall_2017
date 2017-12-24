package assignments.a5;

public class Driver {

    public static void main(String[] args) {
        PasswordGenerator.generatePassword();

        int length = 0;
        for (; !PasswordGenerator.matchLength(length); length++) {}

        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            for (char c = '0'; c <= 'Z'; c++) {
                if (PasswordGenerator.matchCharAt(c, i)) {
                    password[i] = c;
                    break;
                }
            }
        }

        String passwordStr = new String(password);
        if (PasswordGenerator.matchPasswordAndLength(passwordStr, length)) {
            System.out.println("Password: " + passwordStr);
        } else {
            System.out.println("Could not determine the password or length");
        }
    }
}