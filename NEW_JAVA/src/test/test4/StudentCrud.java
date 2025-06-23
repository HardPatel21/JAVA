package test.test4;

import java.util.Scanner;

public class StudentCrud {
    public int studentCount;
    public final int SIZE = 100;
    public Student[] students = new Student[SIZE];
    Scanner sc = new Scanner(System.in);

    public void addStudent() {
        if (studentCount >= SIZE) {
            System.out.println("Storage full. Cannot add more students.");
            return;
        }

        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();

        students[studentCount++] = new Student(id, name, marks);
        System.out.println("Student added.");
    }

    public void updateStudent() {
        System.out.print("Enter ID to update: ");
        int id = sc.nextInt();
        for (int i = 0; i < studentCount; i++) {
            if (students[i] != null && students[i].s_id == id) {
                sc.nextLine();
                System.out.print("Enter new name: ");
                students[i].s_name = sc.nextLine();
                System.out.print("Enter new marks: ");
                students[i].s_marks = sc.nextFloat();
                System.out.println("Student updated.");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public void removeStudents() {
        System.out.print("Enter ID to delete: ");
        int id = sc.nextInt();
        for (int i = 0; i < studentCount; i++) {
            if (students[i] != null && students[i].s_id == id) {
                students[i] = null;
                System.out.println("Student deleted.");
                return;
            }
        }
        System.out.println("Student not found.");
    }


    public void listStudents() {
        if (studentCount == 0) {
            System.out.println("No students to display.");
            return;
        }
        for (int i = 0; i < studentCount; i++) {
            if (students[i] != null)
                students[i].getDetails();
        }
    }
}
