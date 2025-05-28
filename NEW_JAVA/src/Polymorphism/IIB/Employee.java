package Polymorphism.IIB;

public class Employee {
    public double salary;

    public Employee() {
        System.out.println("salary is " + salary);
    }

    {
        System.out.println("Employee Instance Initializer Block");
        salary = 50000.900;
    }
}
