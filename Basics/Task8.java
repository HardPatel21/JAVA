/*
 Develop a program to take the user's marks in three subjects (Math, Science, and English) and calculate their average score.
*/

import java.util.Scanner;

public class Task8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks of Maths: ");
        double maths = sc.nextDouble();
        System.out.print("Enter the marks of Science: ");
        double science = sc.nextDouble();
        System.out.print("Enter the marks of English: ");
        double english = sc.nextDouble();

        double average = (maths + science + english) / 3.0;
        System.out.println("Your Marks average is: " + average);
        sc.close();
    }
}
