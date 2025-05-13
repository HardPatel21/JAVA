package OOPJ.inheritance.classes;

public class Manager_1 extends Employee_1{
    public int managerID;

    public Manager_1(int employeeID, String empName, int managerID) {
        super(employeeID, empName);
        this.managerID = managerID;
    }

    public void showManager_1Details() {
        System.out.println("managerID: " + managerID);
    }
}
