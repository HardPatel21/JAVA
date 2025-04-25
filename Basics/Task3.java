/*
Build a Java application to collect the user's contact information (name, email, and phone number) and display it back to them.
*/

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter email: ");
        String email = sc.nextLine();
        System.out.print("Enter phone number: ");
        String phone_number = sc.nextLine();
        System.out.println();
        System.out.println("Your name is: " + name);
        System.out.println("Your email is: " + email);
        System.out.println("Your phone number is: " + phone_number);
        
        sc.close();    
    }
}
