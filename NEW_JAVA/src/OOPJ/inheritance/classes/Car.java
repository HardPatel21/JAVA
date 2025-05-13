package OOPJ.inheritance.classes;
import java.util.Scanner;

public class Car extends Vehicle{
    public int numberOfDoors;

    public Car(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public Car(String make, int year, String model, int numberOfDoors) {
        super(make, year, model);
        this.numberOfDoors = numberOfDoors;
    }

    public void getCarDetails() {
        System.out.println("numberOfDoors: " + numberOfDoors);
    }

    public void getDetails() {
        getVehicleDetails();
        getCarDetails();
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the make: ");
        make = sc.nextLine();
        System.out.print("Enter the model: ");
        model = sc.nextLine();
        System.out.print("Enter the year: ");
        year = sc.nextInt();
        System.out.print("Enter the numberOfDoors: ");
        numberOfDoors = sc.nextInt();
    }
}
