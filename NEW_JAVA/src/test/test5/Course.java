package test.test5;

public class Course {
    public String courseName;
    public int courseId;
    public int studentCount = 0;
    private Student[] students = new Student[50];

    public Course(int id, String name) {
        this.courseId = id;
        this.courseName = name;
    }

    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String name) {
        this.courseName = name;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public Student getStudentByIndex(int index) {
        return students[index];
    }

    @Override
    public String toString() {
        return "Course ID: " + courseId + ", Name: " + courseName;
    }

    public void getCourseDetails() {
        System.out.println("courseName: " + courseName + ", courseId: " + courseId);
    }

}
