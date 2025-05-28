package Polymorphism.Super_KW;

public class SavingsAccount extends Account {
    public int interestRate;

    public SavingsAccount(int accountNumber, double balance, String holderName, int interestRate) {
        super(accountNumber, balance, holderName);
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        System.out.println("Savings withdrawal processed with interest rate: [" + interestRate + "]%");
    }
}
