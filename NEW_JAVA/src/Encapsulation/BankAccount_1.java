package Encapsulation;

public class BankAccount_1 {
    private String accountNo;
    private String accountHolder;
    private double balance;

    public BankAccount_1(String accountNo, String accountHolder, double balance) {
        this.accountNo = accountNo;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of " + amount + " Successful. New Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount && (balance-amount) > 2000) {
            balance -= amount;
            System.out.println("Withdrawal of " + amount + " Successful. New Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance. Withdrawal of " + amount + " Unsuccessful.");
        }
    }
}

/*
Package is used to categorize the classes and interfaces so that they can be easily maintained.
> Multiple classes can be defined in a single package.
*/
