package Encapsulation;

import Encapsulation.BankAccount_1;
import Encapsulation.Transaction;

public class Bank {
    public static void main(String[] args) {
        BankAccount_1 father = new BankAccount_1("123456789", "Kuber", 100000);
        BankAccount_1 son = new BankAccount_1("987654321", "Hard", 50000);

        System.out.println("Initial balances: ");
        System.out.println(father.getAccountHolder() + ": " + father.getBalance());
        System.out.println(son.getAccountHolder() + ": " + son.getBalance());

        Transaction transaction = new Transaction();
        transaction.transfer(father, son, 50000);

        System.out.println("Final balances after transfer: ");
        System.out.println(father.getAccountHolder() + ": " + father.getBalance());
        System.out.println(son.getAccountHolder() + ": " + son.getBalance());
    }
}
