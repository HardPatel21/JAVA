package test.test5;

import test.test5.Student;
import test.test5.Course;

import java.sql.Connection;
import java.util.Scanner;

public class Final_Agg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CourseManager manager = new CourseManager();
        int choice;

        do {
            System.out.println("\n==== Course Management System ====");
            System.out.println("1. Add Course");
            System.out.println("2. Display All Courses");
            System.out.println("3. Update Course");
            System.out.println("4. Delete Course");
            System.out.println("5. Add Student to Course");
            System.out.println("6. Display Students of a Course");
            System.out.println("7. Add courses to database and file");
            System.out.println("8. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Course ID: ");
                    int cid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Course Name: ");
                    String cname = sc.nextLine();
                    manager.addCourse(new Course(cid, cname));
                    break;

                case 2:
                    manager.displayCourses();
                    break;

                case 3:
                    System.out.print("Enter Course ID to Update: ");
                    int uid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter New Course Name: ");
                    String newName = sc.nextLine();
                    manager.updateCourse(uid, newName);
                    break;

                case 4:
                    System.out.print("Enter Course ID to Delete: ");
                    int did = sc.nextInt();
                    manager.deleteCourse(did);
                    break;

                case 5:
//                    System.out.print("Enter Course ID to Add Student: ");
//                    int courseId = sc.nextInt();
//                    sc.nextLine();
//                    Course course = manager.getCourseById(courseId);
//                    if (course != null) {
//                        System.out.print("Enter Student ID: ");
//                        int sid = sc.nextInt();
//                        sc.nextLine();
//                        System.out.print("Enter Student Name: ");
//                        String sname = sc.nextLine();
//                        System.out.print("Enter Student Marks: ");
//                        double smarks = sc.nextDouble();
//                        System.out.println("Student added to course.");
//                    } else {
//                        System.out.println("Course not found.");
//                    }
                    break;

                case 6:
                    System.out.print("Enter Course ID to Display Students: ");
                    int cid2 = sc.nextInt();
                    Course course2 = manager.getCourseById(cid2);
                    if (course2 != null) {
                        course2.getCourseDetails();
                    } else {
                        System.out.println("Course not found.");
                    }
                    break;

                case 7:
                    System.out.print("Enter Course ID: ");
                    int cid1 = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Course Name: ");
                    String cname1 = sc.nextLine();
                    manager.addCourses(new Course(cid1, cname1));
                    break;

                case 8:
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 8);

        sc.close();
    }
}
