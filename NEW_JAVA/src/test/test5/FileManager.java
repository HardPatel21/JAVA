package test.test5;

import java.io.FileWriter;
import java.io.IOException;

public class FileManager {
    public static final String FILE_PATH = "data.txt";

    public static void writeCourseToFile(int courseId, String courseName) {
        try (FileWriter fw = new FileWriter(FILE_PATH, true)) {
            fw.write("COURSE," + courseId + "," + courseName + "\n");
        } catch (IOException e) {
            System.out.println("File Write Error (Course): " + e.getMessage());
        }
    }

    public static void writeStudentToFile(int studentId, String studentName, int courseId) {
        try (FileWriter fw = new FileWriter(FILE_PATH, true)) {
            fw.write("STUDENT," + studentId + "," + studentName + "," + courseId + "\n");
        } catch (IOException e) {
            System.out.println("File Write Error (Student): " + e.getMessage());
        }
    }

    public static void clearFile() {
        try (FileWriter fw = new FileWriter(FILE_PATH)) {
            fw.write(""); // Clear contents
        } catch (IOException e) {
            System.out.println("File Clear Error: " + e.getMessage());
        }
    }

    // Rewrite full course list to file (used on update/delete)
    public static void rewriteAllCourses(Course[] courses, int count) {
        try (FileWriter fw = new FileWriter("data.txt")) {
            for (int i = 0; i < count; i++) {
                fw.write("COURSE," + courses[i].getCourseId() + "," + courses[i].getCourseName() + "\n");

                // Write students of this course
                Course c = courses[i];
                for (int j = 0; j < c.getStudentCount(); j++) {
                    Student s = c.getStudentByIndex(j);
                    fw.write("STUDENT," + s.getS_id() + "," + s.getS_name() + "," + c.getCourseId() + "\n");
                }
            }
        } catch (IOException e) {
            System.out.println("File Write Error: " + e.getMessage());
        }
    }

}
