/*
Scenario 1: Employee Database
In an employee database system, create a class called "Employee" with an instance initializer block that
initializes a static database connection. The block runs whenever an object of the "Employee" class is
created.
*/
package Polymorphism.IIB;

public class IIB_1 {
    public static void main(String[] args) {
        Employee e = new Employee();

        System.out.println(e.salary);
    }
}
