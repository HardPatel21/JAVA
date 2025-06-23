package test.test3;

import java.io.*;
import java.sql.*;
import java.util.*;

public class Test_1 {
    static List<Student> studentList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Calculate Average");
            System.out.println("4. Save to File");
            System.out.println("5. Save to Database (JDBC)");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> addStudent();
                case 2 -> viewStudents();
                case 3 -> calculateAverage();
                case 4 -> saveToFile();
                case 5 -> saveToDatabase();
            }
        } while (choice != 0);
    }

    static void addStudent() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();

        studentList.add(new Student(id, name, marks));
        System.out.println("Student added successfully!");
    }

    static void viewStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No records found.");
        } else {
            for (Student s : studentList) {
                System.out.println(s);
            }
        }
    }

    static void calculateAverage() {
        if (studentList.isEmpty()) {
            System.out.println("No data to calculate average.");
            return;
        }
        double total = 0;
        for (Student s : studentList) total += s.getMarks();
        System.out.println("Average Marks: " + (total / studentList.size()));
    }

    static void saveToFile() {
        try (PrintWriter pw = new PrintWriter("students.txt")) {
            for (Student s : studentList) pw.println(s);
            System.out.println("Data saved to students.txt");
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }

    static void saveToDatabase() {
        final String URL = "jdbc:mysql://localhost:3306/hard";
        final String USER = "root";
        final String PASS = "Hard@2111";

        try (Connection con = DriverManager.getConnection(URL, USER, PASS)) {
            String sql = "INSERT INTO students (id, name, marks) VALUES (?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(sql);

            for (Student s : studentList) {
                pst.setInt(1, s.getId());
                pst.setString(2, s.getName());
                pst.setDouble(3, s.getMarks());
                pst.executeUpdate();
            }

            System.out.println("Data inserted into database successfully!");

        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}

