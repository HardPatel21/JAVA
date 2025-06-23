package test.test2;

import java.io.*;
import java.sql.*;
import java.util.*;

// Department class
class Department implements Serializable{
    int deptId;
    String deptName;

    Department(int deptId, String deptName) {
        this.deptId = deptId;
        this.deptName = deptName;
    }

    public String toString() {
        return deptId + " - " + deptName;
    }
}

// Employee class (aggregates Department)
class Employee implements Serializable {
    int empId;
    String empName;
    double salary;
    Department dept;

    Employee(int empId, String empName, double salary, Department dept) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.dept = dept;
    }

    public String toString() {
        return empId + " | " + empName + " | " + salary + " | " + dept;
    }
}

// Manager class
public class EmployeeManager {
    static List<Employee> employeeList = new ArrayList<>();
    static final String FILE_NAME = "employees.txt";
    static final String DB_URL = "jdbc:mysql://localhost:3306/hard";
    static final String USER = "root";
    static final String PASS = "Hard@2111"; // Replace with actual password

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Save to File");
            System.out.println("4. Load from File");
            System.out.println("5. Save to Database");
            System.out.println("6. Load from Database");
            System.out.println("7. Exit");
            System.out.print("Choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1 -> addEmployee(sc);
                case 2 -> displayEmployees();
                case 3 -> saveToFile();
                case 4 -> loadFromFile();
                case 5 -> saveToDatabase();
                case 6 -> loadFromDatabase();
                case 7 -> System.out.println("Goodbye!");
                default -> System.out.println("Invalid!");
            }
        } while (ch != 7);
    }

    static void addEmployee(Scanner sc) {
        System.out.print("Emp ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Salary: ");
        double sal = sc.nextDouble();
        System.out.print("Dept ID: ");
        int did = sc.nextInt();
        sc.nextLine();
        System.out.print("Dept Name: ");
        String dname = sc.nextLine();

        Department d = new Department(did, dname);
        Employee e = new Employee(id, name, sal, d);
        employeeList.add(e);
        System.out.println("Employee added.");
    }

    static void displayEmployees() {
        if (employeeList.isEmpty()) {
            System.out.println("No employees found.");
        } else {
            for (Employee e : employeeList) {
                System.out.println(e);
            }
        }
    }

    static void saveToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(employeeList);
            System.out.println("Saved to file.");
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }

    static void loadFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            employeeList = (List<Employee>) ois.readObject();
            System.out.println("Loaded from file.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }

    static void saveToDatabase() {
        try (Connection con = DriverManager.getConnection(DB_URL, USER, PASS)) {
            PreparedStatement deptStmt = con.prepareStatement("REPLACE INTO departments VALUES (?, ?)");
            PreparedStatement empStmt = con.prepareStatement("REPLACE INTO employees VALUES (?, ?, ?, ?)");

            for (Employee e : employeeList) {
                deptStmt.setInt(1, e.dept.deptId);
                deptStmt.setString(2, e.dept.deptName);
                deptStmt.executeUpdate();

                empStmt.setInt(1, e.empId);
                empStmt.setString(2, e.empName);
                empStmt.setDouble(3, e.salary);
                empStmt.setInt(4, e.dept.deptId);
                empStmt.executeUpdate();
            }

            System.out.println("Saved to database.");
        } catch (SQLException e) {
            System.out.println("DB Error: " + e.getMessage());
        }
    }

    static void loadFromDatabase() {
        employeeList.clear();
        try (Connection con = DriverManager.getConnection(DB_URL, USER, PASS)) {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("""
                SELECT e.emp_id, e.emp_name, e.salary, d.dept_id, d.dept_name
                FROM employees e JOIN departments d ON e.dept_id = d.dept_id
            """);

            while (rs.next()) {
                int id = rs.getInt("emp_id");
                String name = rs.getString("emp_name");
                double sal = rs.getDouble("salary");
                int did = rs.getInt("dept_id");
                String dname = rs.getString("dept_name");

                Department d = new Department(did, dname);
                Employee emp = new Employee(id, name, sal, d);
                employeeList.add(emp);
            }

            System.out.println("Loaded from database.");
        } catch (SQLException e) {
            System.out.println("DB Error: " + e.getMessage());
        }
    }
}
