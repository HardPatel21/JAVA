/*
Develop a program that takes a user's birthdate as input and calculates their current age.
*/

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your birthYear: ");
        int birthYear = sc.nextInt();

        int age;
        age = 2025 - birthYear;
        System.out.println("Their current age is: " + age);
        sc.close();
    }   
}
