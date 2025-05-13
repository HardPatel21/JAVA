/*
2. Vehicle Information System
 Problem Statement:
 Design a class `Vehicle` with attributes `make`, `model`, and `year`. Create a subclass `Car` that adds a `numberOfDoors` attribute. Implement methods to input and display vehicle and car details using inheritance.
*/
package OOPJ.inheritance.classes;

public class Vehicle {
    public String make;
    public String model;
    public int year;

    public Vehicle() {}

    public Vehicle(String make, int year, String model) {
        this.make = make;
        this.year = year;
        this.model = model;
    }

    public void getVehicleDetails() {
        System.out.println("make: " + make + ", model: " + model + ", year: " + year);
    }

}
