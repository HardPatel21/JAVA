package OOPJ.inheritance.classes;

public class Vehicle_1 {
    public String brand;
    public String model;
    public int year;

    public Vehicle_1(String brand, int year, String model) {
        this.brand = brand;
        this.year = year;
        this.model = model;
    }

    public void showVehicle_1Details() {
        System.out.println("brand: " + brand + ", model: " + model + ", year: " + year);
    }
}
