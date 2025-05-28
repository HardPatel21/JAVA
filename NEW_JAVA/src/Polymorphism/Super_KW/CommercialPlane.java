package Polymorphism.Super_KW;
import  Polymorphism.Super_KW.CommercialPlane;

public class CommercialPlane extends Aircraft {
    int passengerCapacity;

    public CommercialPlane(String manufacturer, double altitude, double maxSpeed, int passengerCapacity) {
        super(manufacturer, altitude, maxSpeed);
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("Commercial plane can carry [" + passengerCapacity + "] passengers");
    }
}
