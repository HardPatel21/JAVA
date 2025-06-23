package test.test4;

import test.test4.Student;

import java.util.Scanner;

import static java.lang.System.exit;

public class Final {
    public static void main(String[] args) {
        StudentCrud cr = new StudentCrud();
        int choice;
        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("----------Welcome to the Student Management Portal----------");

            System.out.println("1-----add student");
            System.out.println("2-----update student");
            System.out.println("3-----delete student");
            System.out.println("4-----view student list");
            System.out.println("5-----exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    cr.addStudent();
                    break;
                case 2:
                    cr.updateStudent();
                    break;
                case 3:
                    cr.removeStudents();
                    break;
                case 4:
                    cr.listStudents();
                    break;
                case 5:
                    exit(0);
                default:
                    System.out.println("Enter the valid choice! please");
                    break;
            }
        } while (true);
    }
}
