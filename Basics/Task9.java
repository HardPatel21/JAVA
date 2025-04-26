/*
Create a program that asks the user for their address, including street, city, state, and zip code, and displays the complete address.
*/

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the street: ");
        String street = sc.nextLine();
        System.out.print("Enter the city: ");
        String city = sc.nextLine();
        System.out.print("Enter the state: ");
        String state = sc.nextLine();
        System.out.print("Enter the ZipCode: ");
        int zipCode = sc.nextInt();

        System.out.println("------------------------YOUR ADDRESS-----------------------");

        System.out.println("Your street: " + street + ", Your city: " + city + ", Your state: " + state + ", Your zip code: " + zipCode);
        
        sc.close();
    }    
}
