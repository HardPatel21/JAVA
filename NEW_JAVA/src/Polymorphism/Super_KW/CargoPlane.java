package Polymorphism.Super_KW;

public class CargoPlane extends Aircraft{
    int cargoCapacity;

    public CargoPlane(String manufacturer, double altitude, double maxSpeed, int cargoCapacity) {
        super(manufacturer, altitude, maxSpeed);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("Cargo plane can carry [" + cargoCapacity + "] tons of cargo");
    }
}
