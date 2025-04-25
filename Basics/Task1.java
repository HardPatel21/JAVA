/*
1. Write a Java program to take the user's name as input and display a personalized greeting message.
*/

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = sc.nextLine();
        System.out.println("Hi! My name is "+ name);
        sc.close();        
    }
}
