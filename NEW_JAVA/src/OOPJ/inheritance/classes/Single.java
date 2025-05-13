package OOPJ.inheritance.classes;

import OOPJ.inheritance.classes.Employee;

public class Single {
    public static void main(String[] args) {
        Manager m = new Manager("John Doe", 101, 20000.00, "Computer");
        m.getDetails();
    }
}
