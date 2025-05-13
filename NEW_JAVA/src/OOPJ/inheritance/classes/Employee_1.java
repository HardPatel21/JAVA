package OOPJ.inheritance.classes;

public class Employee_1 {
    public int employeeID;
    public String empName;

    public Employee_1(int employeeID, String empName) {
        this.employeeID = employeeID;
        this.empName = empName;
    }

    public void showEmployee_1Details() {
        System.out.println("employeeID: " + employeeID + ", empName: " + empName);
    }
}
