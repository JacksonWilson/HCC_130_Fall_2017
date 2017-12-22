package labs.lab12;

import java.io.IOException;
import java.text.NumberFormat;

import utils.KeyboardReader;

public class Driver {
    public static void main(String[] args) {
        try (KeyboardReader keyReader = new KeyboardReader(System.in)) {
            double balance = keyReader.readDouble("Enter the balance in the account: ");
            double interestRate = keyReader.readDouble("Enter the interest rate for the account: ");
            SavingsAccount account = new SavingsAccount(balance, interestRate);
            account.deposit(keyReader.readDouble("Enter sum of desposits: "));
            account.withdraw(keyReader.readDouble("Enter sum of withdrawals: "));
            System.out.println("The ending balance for this account will be: " + NumberFormat.getCurrencyInstance().format(account.calcYearEndBalance()));
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}