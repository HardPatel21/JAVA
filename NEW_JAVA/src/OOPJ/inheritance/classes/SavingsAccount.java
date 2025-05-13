package OOPJ.inheritance.classes;

public class SavingsAccount extends Account{
    public int interestRate;

    public SavingsAccount(int interestRate) {
        this.interestRate = interestRate;
    }

    public SavingsAccount(String accountNumber, String accountHolderName, double balance, int interestRate) {
        super(accountNumber, accountHolderName, balance);
        this.interestRate = interestRate;
    }

    public void calculateInterest() {
        double interest = (balance * interestRate) / 100;
        System.out.println("Interest: "+ interest);
    }

    public void getSavingsAccountDetails() {
        System.out.println("interestRate: " + interestRate);
    }
    public void getDetails() {
        getAccountDetails();
        getSavingsAccountDetails();
        calculateInterest();
    }
}
