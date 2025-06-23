package test.test5;

import java.sql.Connection;

public class CourseManager {
    public Course[] courses = new Course[100];
    public int courseCount = 0;

    public void addCourse(Course course) {
            if (courseCount < courses.length) {
                courses[courseCount++] = course;

                DatabaseManager.insertCourse(course.getCourseId(), course.getCourseName());
                FileManager.writeCourseToFile(course.getCourseId(), course.getCourseName());

                System.out.println("Course added successfully.");
            } else {
                System.out.println("Course limit reached.");
            }
        }

        public void displayCourses() {
            if (courseCount == 0) {
                System.out.println("No courses available.");
                return;
            }
            for (int i = 0; i < courseCount; i++) {
                System.out.println(courses[i]);
            }
        }

        public void updateCourse(int id, String newName) {
            for (int i = 0; i < courseCount; i++) {
                if (courses[i].getCourseId() == id) {
                    courses[i].setCourseName(newName);

                    DatabaseManager.updateCourse(id, newName);
                    FileManager.rewriteAllCourses(courses, courseCount);

                    System.out.println("Course updated.");
                    return;
                }
            }
            System.out.println("Course not found.");
        }

        public void deleteCourse(int id) {
            for (int i = 0; i <courseCount; i++) {
                if (courses[i].getCourseId() == id) {
                    for (int j = i; j < courseCount - 1; j++) {
                        courses[j] = courses[j + 1];
                    }
                    courses[--courseCount] = null;

                    DatabaseManager.deleteCourse(id);
                    FileManager.rewriteAllCourses(courses, courseCount);

                    System.out.println("Course deleted.");
                    return;
                }
            }
            System.out.println("Course not found.");
        }

        public Course getCourseById(int id) {
            for (int i = 0; i < courseCount; i++) {
                if (courses[i].getCourseId() == id) {
                    return courses[i];
                }
            }
            return null;
        }

    public void addCourses(Course course) {
        if (courseCount < courses.length) {
            courses[courseCount++] = course;
            DatabaseManager.insertCourse(course.getCourseId(), course.getCourseName());
            FileManager.writeCourseToFile(course.getCourseId(), course.getCourseName());
            System.out.println("Course added successfully.");
        } else {
            System.out.println("Course limit reached.");
        }
    }


}
