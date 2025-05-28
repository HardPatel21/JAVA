/*
Problem: Develop a student grading system where you have different grading scales for different courses. Use method overloading to calculate the final grade based on the course's grading scale.
   - Example: Create a `Student` class with overloaded `calculateFinalGrade` methods for each course, allowing custom grading logic.
*/

package Polymorphism;

public class Student {
    public static void calculateFinalGrade(int maths, int phy, int chem) {
        System.out.println("Final Grade: " + (maths + phy + chem));
    }

    public static void calculateFinalGrade(int maths, float COA, float OS) {
        System.out.println("Final Grade: " + (maths + COA + OS));
    }

    public static void calculateFinalGrade(int DMs, double PEM, float python) {
        System.out.println("Final Grade: " + (DMs + PEM + python));
    }

    public static void calculateFinalGrade(float JS, float JAVA, float CSS) {
        System.out.println("Final Grade: " + (JS + JAVA + CSS));
    }

    public static void calculateFinalGrade(int HTML, float SQL, double dataScience) {
        System.out.println("Final Grade: " + (HTML + SQL + dataScience));
    }

    public static void main(String[] args) {
        calculateFinalGrade(40, 50, 60);
        calculateFinalGrade(50, 70.70f, 10.10f);
        calculateFinalGrade(69, 69.69, 70.0f);
        calculateFinalGrade(50.50f, 40.40f, 30.30f);
        calculateFinalGrade(60, 50.50f, 45.45);
    }
}
