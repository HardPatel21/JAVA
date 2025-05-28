/*

💰 Problem Statement 2: Advanced Banking System with Account Types

Title: Model a Banking System with Account Inheritance Using super

Objective:
Create a banking system with different account types. Begin with a base class Account and extend it for different account types.

🔹 Class Account (Base Class)

* Fields: accountNumber, holderName, balance
* Constructor to initialize these fields
* Method deposit(amount)
* Method withdraw(amount) – checks for sufficient balance
* Method display() – prints account info

🔹 Class SavingsAccount (Extends Account)

* Additional field: interestRate
* Overrides withdraw(amount) to:

  * Call super.withdraw() for base checks
  * Then log: "Savings withdrawal processed with interest rate: [interestRate]%"

🔹 Class CurrentAccount (Extends Account)

* Additional field: overdraftLimit
* Overrides withdraw(amount) to:

  * Allow withdrawals even beyond balance (up to overdraftLimit)
  * Call super.withdraw() but enhance it with logic
  * If overdrawn, print: "Overdraft in use. Remaining limit: [remainingOverdraft]"

🔹 Class PremiumAccount (Extends SavingsAccount)

* Adds a reward system: rewardPoints
* Overrides deposit():

  * Call super.deposit() then add reward points
* Overrides display() to include reward points

Requirements:

* Use super to:

  * Call parent constructors and methods
  * Extend and combine behaviors in overridden methods
* Create a transaction simulator that uses polymorphism to handle all account types and logs the results

Goal:
Demonstrate how super supports complex financial logic by building on shared behavior while customizing operations in each account type.

*/

package Polymorphism.Super_KW;

import Polymorphism.CurrentAccount;

public class Super_KW3 {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(101, 5000.00, "Hard Patel", 1);
        CurrentAccount cu = new CurrentAccount(102, 6000.00, "Jal Patel", 1000);
        PremiumAccount pr = new PremiumAccount(103, 7000.00, "Jay Patel", 2,  600);
        Account ac =  new Account(100, 10000.500, "Prerak Patel");


        sa.display();
        cu.display();
        pr.display();

        sa.deposit(1000.00);
        sa.withdraw(500.00);
        sa.display();

        cu.deposit(5000.100);
        cu.withdraw(4000.00);
        cu.display();

        pr.deposit(500.00);
        pr.withdraw(1000.00);
        pr.display();

        ac.deposit(10000.400);
        ac.withdraw(4000.00);
        ac.display();
    }
}
