package OOPJ.inheritance.classes;

public class Manager extends Employee {
    public String department;

    public Manager(String department) {
        this.department = department;
    }

    public Manager(String name, int employeeId, double salary, String department) {
        super(name, employeeId, salary);
        this.department = department;
    }

    public void getManagerDetails() {
        System.out.println("Department: " + department);
    }

    public void getDetails() {
        getEmployeeDetails();
        getManagerDetails();
    }
}
