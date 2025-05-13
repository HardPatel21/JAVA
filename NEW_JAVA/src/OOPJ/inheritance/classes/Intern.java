package OOPJ.inheritance.classes;

public class Intern extends Employee_1{
    public int baseSalary;

    public Intern(int employeeID, String empName, int baseSalary) {
        super(employeeID, empName);
        this.baseSalary = baseSalary;
    }

    public void showInternDetails() {
        System.out.println("baseSalary :" + baseSalary);
    }
}
