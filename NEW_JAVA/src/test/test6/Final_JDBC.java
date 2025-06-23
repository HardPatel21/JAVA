package test.test6;

import java.sql.*;
import java.util.Scanner;

public class Final_JDBC {
    public static final String DB_URL = "jdbc:mysql://localhost:3306/Employee_Management";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "Hard@2111"; // Change this

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            while (true) {
                System.out.println("\n===== Employee Management System =====");
                System.out.println("1. Add Employee");
                System.out.println("2. View Employees");
                System.out.println("3. Update Employee");
                System.out.println("4. Delete Employee");
                System.out.println("5. Exit");
                System.out.print("Choose option: ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        addEmployee(conn, sc);
                        break;
                    case 2:
                        viewEmployees(conn);
                        break;
                    case 3:
                        updateEmployee(conn, sc);
                        break;
                    case 4:
                        deleteEmployee(conn, sc);
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid choice.");
                }
            }
        } catch (SQLException e) {
            System.out.println("Database Error: " + e.getMessage());
        }
    }

    public static void addEmployee(Connection conn, Scanner sc) throws SQLException {
        System.out.print("Enter name: ");
        String name = sc.next();
        System.out.print("Enter department: ");
        String dept = sc.next();
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        String sql = "INSERT INTO employee (name, department, salary) VALUES (?, ?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, name);
            ps.setString(2, dept);
            ps.setDouble(3, salary);
            ps.executeUpdate();
            System.out.println("Employee added successfully.");
        }
    }

    public static void viewEmployees(Connection conn) throws SQLException {
        String sql = "SELECT * FROM employee";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            System.out.println("\n--- Employee List ---");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                        ", Name: " + rs.getString("name") +
                        ", Dept: " + rs.getString("department") +
                        ", Salary: " + rs.getDouble("salary"));
            }
        }
    }

    public static void updateEmployee(Connection conn, Scanner sc) throws SQLException {
        System.out.print("Enter employee ID to update: ");
        int id = sc.nextInt();
        System.out.print("New name: ");
        String name = sc.next();
        System.out.print("New department: ");
        String dept = sc.next();
        System.out.print("New salary: ");
        double salary = sc.nextDouble();

        String sql = "UPDATE employee SET name=?, department=?, salary=? WHERE id=?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, name);
            ps.setString(2, dept);
            ps.setDouble(3, salary);
            ps.setInt(4, id);
            int updated = ps.executeUpdate();
            if (updated > 0)
                System.out.println("Employee updated successfully.");
            else
                System.out.println("Employee not found.");
        }
    }

    public static void deleteEmployee(Connection conn, Scanner sc) throws SQLException {
        System.out.print("Enter employee ID to delete: ");
        int id = sc.nextInt();

        String sql = "DELETE FROM employee WHERE id=?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            int deleted = ps.executeUpdate();
            if (deleted > 0)
                System.out.println("Employee deleted successfully.");
            else
                System.out.println("Employee not found.");
        }
    }
}
