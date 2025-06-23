package Encapsulation;

public class Transaction {
    public void transfer(BankAccount_1 fromAccount, BankAccount_1 toAccount, double amount) {
        if(fromAccount.getBalance() >= amount) {
            fromAccount.withdraw(amount);
            toAccount.deposit(amount);
            System.out.println("Transfer of " + amount + " from " + fromAccount.getAccountHolder() + " to " + toAccount.getAccountHolder() + " Successful.");
        } else {
            System.out.println("Transfer Failed. Insufficient funds in the sender's account.");
        }
    }
}
