/*
3. Student Result Processing
 Problem Statement:
 Create a class `Student` with properties `rollNo`, `name`, and `marks`. Derive a class `Result` that computes and displays the grade of the student based on marks. Use single inheritance to reuse the student data in the `Result` class.
*/
package OOPJ.inheritance.classes;

public class Student {
    public int rollNo;
    public String name;
    public double marks;

    public Student() {}

    public Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public void getStudentDetails() {
        System.out.println("rollNo: " + rollNo + ", name: " + name + ", marks:" + marks);
    }
}
