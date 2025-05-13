package OOPJ.inheritance.classes;

import OOPJ.inheritance.classes.Account;

public class Fourth {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("1829", "John Doe", 90000.92, 2);
        sa.getDetails();
    }
}
