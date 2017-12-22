package labs.lab12;

public class SavingsAccount {
    private double balance;
    private double interestRate;

    public SavingsAccount() {
        this(0, 0);
    }

    public SavingsAccount(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public double withdraw(double amount) {
        if (amount < this.balance) {
            this.balance -= amount;
        } else {
            amount = this.balance;
            this.balance = 0;
        }
        return amount;
    }

    public double calcYearEndBalance() {
        return balance * interestRate + balance;
    }
}