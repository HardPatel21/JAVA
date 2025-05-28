package Polymorphism.Super_KW;

public class Account{
    public int accountNumber;
    public String holderName;
    public double balance;

    public Account(int accountNumber, double balance, String holderName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.holderName = holderName;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount added to the account");
    }

    public void withdraw(double amount) {
        if(balance > amount) {
            balance -= amount;
            System.out.println("Your latest lanace is: " + (balance - amount));
        }else {
            System.out.println("Insufficient balance in your account, can't withdraw");
        }
    }

    public void display() {
        System.out.println("accountNumber: " + accountNumber + ", holderName: " + holderName + ", balance: " + balance);
    }
}
