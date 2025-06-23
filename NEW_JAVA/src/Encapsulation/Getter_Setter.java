package Encapsulation;

public class Getter_Setter {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.setAccountHolderName("ABC");
        b.setAccountType("Savings");
        System.out.println("Account No.: " + b.getAccountNo());
        System.out.println("Account Holder Name: " + b.getAccountHolderName());
        System.out.println("Account Type: " + b.getAccountType());
        System.out.println("Balance: " + b.getBalance());
    }
}
