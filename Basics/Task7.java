/*
Write a Java program that reads a user's favorite color and displays it back to them in a sentence.
*/

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Favourite Colour name: ");
        String colour = sc.nextLine();
        System.err.println("Your Favourite colour name is: " + colour);
        sc.close();
    }
}
