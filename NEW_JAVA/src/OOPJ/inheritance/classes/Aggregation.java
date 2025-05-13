package OOPJ.inheritance.classes;

import OOPJ.inheritance.classes.Department_2;
import OOPJ.inheritance.classes.Employee_2;


public class Aggregation {
    public static void main(String[] args) {
        Department_2 dept = new Department_2(1, "HR", 3);

        Employee_2 e1 = new Employee_2(101, "Alice");
        Employee_2 e2 = new Employee_2(102, "Bob");
        Employee_2 e3 = new Employee_2(103, "Charlie");

        dept.addEmployee(e1);
        dept.addEmployee(e2);
        dept.addEmployee(e3);

        dept.listEmployees();

        dept.removeEmployee(102);

        dept.listEmployees();

        dept.setDeptName("Human Resources");
        System.out.println("Updated Department: " + dept);
    }
}

/*
Task:

📘 Problem Statement: "Vehicle Service Center Management System"

You are building a basic Vehicle Service Center Management System to help track services performed on vehicles. The system must demonstrate inheritance, aggregation, and use arrays for internal data storage.

🔹 Requirements:

1. Create a base class `BaseEntity` with an `id` field.

2. Create a class `Vehicle` that extends `BaseEntity` and includes:

   * `ownerName` (String)
   * `vehicleType` (String)

3. Create a class `ServiceRecord` that extends `BaseEntity` and includes:

   * `description` (String)
   * `cost` (double)

4. Create a class `ServiceCenter` that extends `BaseEntity` and includes:

   * `centerName` (String)
   * A fixed-size array of `Vehicle` (maximum 5 vehicles)
   * A fixed-size array of `ServiceRecord` (maximum 10 service records)
   * CRUD methods to:

     * Add and remove vehicles
     * Add and remove service records
     * List all vehicles
     * List all service records

5. In the `main` method:

   * Instantiate a `ServiceCenter`
   * Add multiple `Vehicle`s
   * Add `ServiceRecord`s related to vehicle service history
   * Perform updates and deletions
   * Display all records to verify the operations


*/
