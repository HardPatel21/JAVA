package OOPJ.inheritance.classes;

import OOPJ.inheritance.classes.Car_1;
import OOPJ.inheritance.classes.Motorcycle;
import OOPJ.inheritance.classes.Truck;

public class heirarchical_2 {
    public static void main(String[] args) {
        System.out.println("--- Creating Car_1 object ---");
        Car_1 c = new Car_1("Hyundai", 2010, "i10", 4);
        c.showCar_1Details();
        c.showVehicle_1Details();

        System.out.println("--- Creating Motorcycle object ---");
        Motorcycle m = new Motorcycle("Hyundai", 2010, "i10", 5);
        m.showMotorcycleDetails();
        c.showVehicle_1Details();

        System.out.println("--- Creating Truck object ---");
        Truck t = new Truck("Hyundai", 2010, "i10", 3);
        t.showTruckDetails();
        c.showVehicle_1Details();
    }
}
