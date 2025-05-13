package OOPJ.inheritance.classes;
import java.util.Scanner;
import java.util.Scanner;

public class Result extends Student{
    public String grade;

    public Result(String grade) {
        this.grade = grade;
    }

    public Result(int rollNo, String name, double marks, String grade) {
        super(rollNo, name, marks);
        this.grade = grade;
    }

    public void inputMarks() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks: ");
        marks = sc.nextDouble();
    }

    public void getGrade() {
        if(marks < 33){
            System.out.println("Grade: F");
        }
        else if(marks >= 33 && marks <=70){
            System.out.println("Grade: C");
        }
        else if(marks > 70 && marks <= 90){
            System.out.println("Grade: B");
        }
        else{
            System.out.println("Grade: A");
        }
    }

    public void getResultDetails() {
        getGrade();
    }
}
