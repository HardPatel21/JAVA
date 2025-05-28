package Polymorphism;

import Polymorphism.Super_KW.Account;

public class CurrentAccount extends Account {
    public int overdraftLimit;

    public CurrentAccount(int accountNumber, double balance, String holderName, int overdraftLimit) {
        super(accountNumber, balance, holderName);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            super.withdraw(amount);
        } else if (amount <= balance + overdraftLimit) {
            double remainingOverdraft = balance - overdraftLimit;
            System.out.println("Overdraft in use. Remaining limit: [" + remainingOverdraft + "]");
            return;
        }
    }
}
