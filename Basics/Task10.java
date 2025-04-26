/*
Implement a basic calculator program that accepts two numbers and an
operator (+, -, *, /) as input, performs the corresponding operation, and
displays the result.
*/

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double a = sc.nextInt();
        System.out.print("Enter the second number: ");
        double b = sc.nextInt();

        sc.nextLine();
        System.out.println("+, -, *, /");
        System.out.print("Enter Your choice: ");
        String choice = sc.nextLine();

        switch (choice) {
            case "+":
                double add = a + b;
                System.out.println("Addition: " + add);
                break;
            case "-":
                double sub = a - b;
                System.out.println("Subtraction: " + sub);
                break;
            case "*":
                double mul = a * b;
                System.out.println("Multiplication: " + mul);
                break;
            case "/":
                double div = a / b;
                System.out.println("Division: " + div);
                break;
            default:
                System.out.println("Enter the valid choice!");
                break;
        }
        sc.close();
    }
}
