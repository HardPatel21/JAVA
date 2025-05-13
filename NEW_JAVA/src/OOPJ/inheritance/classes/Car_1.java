package OOPJ.inheritance.classes;

public class Car_1 extends Vehicle_1{
    public int numOfDoors;

    public Car_1(String brand, int year, String model, int numOfDoors) {
        super(brand, year, model);
        this.numOfDoors = numOfDoors;
    }

    public void showCar_1Details() {
        System.out.println("numOfDoors: " + numOfDoors);
    }
}
