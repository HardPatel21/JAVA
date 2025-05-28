/*

1. Problem: Create a class called `Calculator` that demonstrates method overloading for basic arithmetic operations (addition, subtraction, multiplication, and division).
   - Example: Implement the `add`, `subtract`, `multiply`, and `divide` methods in the `Calculator` class, each overloaded with different parameter lists to perform the respective operations.

*/
package Polymorphism;

public class Calculator {
    public static void add(int a, int b) {
        System.out.println("a + b: " + a + b);
    }

    public static void add(int a, double b) {
        System.out.println("a + b: " + a + b);
    }

    public static void sub(int a, int b) {
        System.out.println("a - b: " + (a - b));
    }

    public static void sub(double a, int b) {
        System.out.println("a - b: " + (a - b));
    }

    public static void mul(int a, float b) {
        System.out.println("a * b: " + (a * b));
    }

    public static void mul(double a, double b) {
        System.out.println("a * b: " + (a * b));
    }

    public static void div(int a, int b) {
        System.out.println("a / b: " + (a / b));
    }

    public static void div(double a, int b) {
        System.out.println("a / b: " + (a / b));
    }

    public static void main(String[] args) {
        add(10, 20);
        add(20, 80.09);
        sub(30, 50);
        sub(81.76, 8);
        mul(10, 30.7);
        mul(50.50, 50.50);
        div(10, 5);
        div(10.10, 5);
    }
}
