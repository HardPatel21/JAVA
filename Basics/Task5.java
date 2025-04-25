/*
Implement a program to accept the user's weight and height, and then calculate their BMI (Body Mass Index).
*/

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your weight (in kg): ");
        double weight = sc.nextDouble();
        
        System.out.print("Enter your height (in meters): ");
        double height = sc.nextDouble();

        double BMI;
        BMI = weight / (height * height);

        System.out.println("Your BMI is: "+ BMI);
        sc.close();
    }
}
