package OOPJ.inheritance.classes;

public class ElectricCar extends Cars{
    public int batteryCapacity = 100;

    public void charge() {
        System.out.println("Charging electric car...");
    }
}
