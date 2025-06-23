package test.test5;

public class Student {
    public String s_name;
    public double s_marks;
    public int s_id;
    public Student[] students = new Student[50];
    public int studentCount = 0;

    public Student(int s_id, String s_name, double s_marks) {
        this.s_id = s_id;
        this.s_name = s_name;
        this.s_marks = s_marks;
    }

    public String getS_name() {
        return s_name;
    }

    public int getS_id() {
        return s_id;
    }

    public double getS_marks() {
        return s_marks;
    }

    public void setName(String name) {
        this.s_name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "s_name='" + s_name + '\'' +
                ", s_marks=" + s_marks +
                ", s_id=" + s_id +
                '}';
    }

    public void getDetails() {
        System.out.println("s_name: " + s_name + ", s_marks: " + s_marks + ", s_id: " + s_id);
    }

    public void addStudent(Student student) {
        if (studentCount < students.length) {
            students[studentCount++] = student;
        } else {
            System.out.println("Cannot add more students to this course.");
        }
    }

    public void displayStudents() {
        if (studentCount == 0) {
            System.out.println("No students enrolled.");
        } else {
            for (int i = 0; i < studentCount; i++) {
                System.out.println(students[i]);
            }
        }
    }
}
