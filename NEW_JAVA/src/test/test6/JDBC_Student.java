package test.test6;

import java.sql.*;
import java.util.Scanner;

public class JDBC_Student {
    public static final String DB_URL = "jdbc:mysql://localhost:3306/myStudent";
    public static final String DB_ROOT = "root";
    public static final String DB_PASSWORD = "Hard@2111";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try(Connection conn = DriverManager.getConnection(DB_URL, DB_ROOT, DB_PASSWORD)){
            while(true) {
                System.out.println("\n===== Student Management System =====");
                System.out.println("1. Add Student");
                System.out.println("2. View Student");
                System.out.println("3. Update Student");
                System.out.println("4. Delete Student");
                System.out.println("5. Exit");
                System.out.print("Choose option: ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        addStudent(conn, sc);
                        break;
                    case 2:
                        viewStudents(conn);
                        break;
                    case 3:
                        updateStudent(conn, sc);
                        break;
                    case 4:
                        deleteStudent(conn ,sc);
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid choice.");
                }
            }
        } catch(SQLException e) {
            System.out.println("Database Error: " + e.getMessage());
        }
    }

    public static void addStudent(Connection conn, Scanner sc) throws SQLException {
        System.out.print("Enter name of the student: ");
        String name = sc.next();
        System.out.print("Enter department of the student: ");
        String dept = sc.next();
        System.out.println("Enter the marks of the student: ");
        double marks = sc.nextDouble();

        String query = "INSERT INTO student_system (name, dept, marks) VALUES (?, ?, ?)";
        try(PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1,name);
            ps.setString(2,dept);
            ps.setDouble(3,marks);
            ps.executeUpdate();
            System.out.println("Student added successfully.");
        }
    }

    public static void viewStudents(Connection conn) throws SQLException {
        String sql = "SELECT * FROM student_system";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            System.out.println("\n--- Student List ---");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                        ", Name: " + rs.getString("name") +
                        ", Dept: " + rs.getString("dept") +
                        ", marks: " + rs.getDouble("marks"));
            }
        }
    }

    public static void updateStudent(Connection conn, Scanner sc) throws SQLException {
        System.out.print("Enter the id of the student: ");
        int id = sc.nextInt();
        System.out.print("Enter name of the student: ");
        String name = sc.next();
        System.out.print("Enter department of the student: ");
        String dept = sc.next();
        System.out.println("Enter the marks of the student: ");
        double marks = sc.nextDouble();

        String query = "UPDATE student_system SET id = ?, name = ?, dept = ?, marks = ?";
        try(PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1,name);
            ps.setString(2,dept);
            ps.setDouble(3,marks);
            ps.setInt(4,id);
            int updated = ps.executeUpdate();
            if (updated > 0)
                System.out.println("Student updated successfully.");
            else
                System.out.println("Student not found.");
        }
    }

    public static void deleteStudent(Connection conn, Scanner sc) throws SQLException {
        System.out.print("Enter student ID to delete: ");
        int id = sc.nextInt();

        String sql = "DELETE FROM student_system WHERE id=?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            int deleted = ps.executeUpdate();
            if (deleted > 0)
                System.out.println("Student deleted successfully.");
            else
                System.out.println("Student not found.");
        }
    }
}