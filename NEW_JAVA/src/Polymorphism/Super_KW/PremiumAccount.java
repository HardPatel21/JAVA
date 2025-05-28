package Polymorphism.Super_KW;

public class PremiumAccount extends SavingsAccount {
    public int rewardPoints;

    public PremiumAccount(int accountNumber, double balance, String holderName, int interestRate, int rewardPoints) {
        super(accountNumber, balance, holderName, interestRate);
        this.rewardPoints = rewardPoints;
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
        System.out.println("Final amount after rewardPoints: " + amount + rewardPoints);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Reward Points: " + rewardPoints);
    }
}
