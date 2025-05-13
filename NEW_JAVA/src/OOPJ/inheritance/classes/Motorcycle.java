package OOPJ.inheritance.classes;

public class Motorcycle extends Vehicle_1{
    public int fuelCapacity;

    public Motorcycle(String brand, int year, String model, int fuelCapacity) {
        super(brand, year, model);
        this.fuelCapacity = fuelCapacity;
    }

    public void showMotorcycleDetails() {
        System.out.println("fuelCapacity: " + fuelCapacity);
    }
}
