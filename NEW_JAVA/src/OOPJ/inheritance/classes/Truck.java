package OOPJ.inheritance.classes;

public class Truck extends Vehicle_1{
    public int numOfBreaks;

    public Truck(String brand, int year, String model, int numOfBreaks) {
        super(brand, year, model);
        this.numOfBreaks = numOfBreaks;
    }

    public void showTruckDetails() {
        System.out.println("numOfBreaks: " + numOfBreaks);
    }
}
