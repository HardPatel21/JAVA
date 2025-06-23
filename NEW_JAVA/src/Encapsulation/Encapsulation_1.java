/*
Scenario 1: Vehicle Manufacturing
In a vehicle manufacturing system, encapsulate the internal details of a "Car" class, such as engine specifications and manufacturing
processes, to protect sensitive information and provide a controlled interface for interacting with the car.
*/
package Encapsulation;

public class Encapsulation_1 {
    public static void main(String[] args) {
        Car c = new Car();
        System.out.println("Car model: " + c.getModel());
        System.out.println("Car brand: " + c.getBrand());
        System.out.println("Car release year: " + c.getYear());
    }
}
