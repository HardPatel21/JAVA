/*
4. Bank Account Management
 Problem Statement:
 Write a Java program with a class `Account` that holds `accountNumber`, `accountHolderName`, and `balance`. Create a subclass `SavingsAccount` that adds an attribute `interestRate` and a method to calculate interest. Demonstrate the use of single inheritance by accessing base class data in the derived class.
*/
package OOPJ.inheritance.classes;

public class Account {
    public String accountNumber;
    public String accountHolderName;
    public double balance;

    public Account() {}

    public Account(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void getAccountDetails() {
        System.out.println("accountNumber: " + accountNumber + ", accountHolderName: " + accountHolderName + ", balance: " + balance);
    }
}
