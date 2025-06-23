package test.test4;

import java.util.Scanner;

public class Student {
    public String s_name;
    public double s_marks;
    public int s_id;

    public Student(int s_id, String s_name, double s_marks) {
        this.s_name = s_name;
        this.s_id = s_id;
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

}
