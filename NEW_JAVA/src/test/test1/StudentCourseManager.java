package test.test1;

import java.io.*;
import java.sql.*;
import java.util.*;

// Course class
class Course implements Serializable {
    String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String toString() {
        return courseName;
    }
}

// Student class with aggregation of courses
class Student implements Serializable {
    int studentId;
    String name;
    List<Course> courses = new ArrayList<>();

    public Student(int studentId, String name, List<Course> courses) {
        this.studentId = studentId;
        this.name = name;
        this.courses = courses;
    }

    public String toString() {
        return "ID: " + studentId + ", Name: " + name + ", Courses: " + courses;
    }
}

// Manager class with all logic
public class StudentCourseManager {
    static List<Student> studentList = new ArrayList<>();
    static final String FILE_NAME = "students.txt";
    static final String DB_URL = "jdbc:mysql://localhost:3306/hard";
    static final String USER = "root";
    static final String PASS = "Hard@2111"; // Change accordingly

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Save to File");
            System.out.println("4. Load from File");
            System.out.println("5. Save to Database");
            System.out.println("6. Load from Database");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    addStudent(sc);
                    break;
                case 2:
                    displayStudents();
                    break;
                case 3:
                    saveToFile();
                    break;
                case 4:
                    loadFromFile();
                    break;
                case 5:
                    saveToDatabase();
                    break;
                case 6:
                    loadFromDatabase();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (ch != 7);
    }

    static void addStudent(Scanner sc) {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        List<Course> courseList = new ArrayList<>();
        System.out.print("Enter number of courses: ");
        int count = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < count; i++) {
            System.out.print("Enter course " + (i + 1) + ": ");
            String cname = sc.nextLine();
            courseList.add(new Course(cname));
        }

        Student s = new Student(id, name, courseList);
        studentList.add(s);
        System.out.println("Student added.");
    }

    static void displayStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students available.");
        } else {
            for (Student s : studentList) {
                System.out.println(s);
            }
        }
    }

    static void saveToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(studentList);
            System.out.println("Data saved to file.");
        } catch (IOException e) {
            System.out.println("Error saving to file: " + e.getMessage());
        }
    }

    static void loadFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            studentList = (List<Student>) ois.readObject();
            System.out.println("Data loaded from file.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading from file: " + e.getMessage());
        }
    }

    static void saveToDatabase() {
        try (Connection con = DriverManager.getConnection(DB_URL, USER, PASS)) {
            PreparedStatement pstStudent = con.prepareStatement("INSERT INTO students (student_id, name) VALUES (?, ?)");
            PreparedStatement pstCourse = con.prepareStatement("INSERT INTO courses (student_id, course_name) VALUES (?, ?)");

            for (Student s : studentList) {
                pstStudent.setInt(1, s.studentId);
                pstStudent.setString(2, s.name);
                pstStudent.executeUpdate();

                for (Course c : s.courses) {
                    pstCourse.setInt(1, s.studentId);
                    pstCourse.setString(2, c.courseName);
                    pstCourse.executeUpdate();
                }
            }
            System.out.println("Data saved to database.");
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }

    static void loadFromDatabase() {
        studentList.clear();
        try (Connection con = DriverManager.getConnection(DB_URL, USER, PASS)) {
            Statement st = con.createStatement();
            ResultSet rsStudents = st.executeQuery("SELECT * FROM students");

            while (rsStudents.next()) {
                int id = rsStudents.getInt("student_id");
                String name = rsStudents.getString("name");

                PreparedStatement pst = con.prepareStatement("SELECT course_name FROM courses WHERE student_id = ?");
                pst.setInt(1, id);
                ResultSet rsCourses = pst.executeQuery();

                List<Course> courses = new ArrayList<>();
                while (rsCourses.next()) {
                    courses.add(new Course(rsCourses.getString("course_name")));
                }

                studentList.add(new Student(id, name, courses));
            }

            System.out.println("Data loaded from database.");
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}

