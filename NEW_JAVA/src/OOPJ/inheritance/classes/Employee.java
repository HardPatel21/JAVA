/*
1. Employee Payroll System
 Problem Statement:
 Create a Java program where a base class `Employee` contains attributes like `name`, `employeeId`, and `salary`. Derive a class `Manager` that inherits from `Employee` and adds an additional attribute `department`. Write methods to display employee details and override them in the `Manager` class to include department information.
*/
package OOPJ.inheritance.classes;

public class Employee {
    public String name;
    public int employeeId;
    public double salary;

    public Employee() {}

    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public void getEmployeeDetails() {
        System.out.println("name: " + name + ", employeeId: " + employeeId + ", salary: " + salary);
    }

}
