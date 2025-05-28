package Polymorphism.Super_KW;
import Polymorphism.Super_KW.HybridPlane;

public class HybridPlane extends CommercialPlane {
    String dualModeType;

    public HybridPlane(String manufacturer, double altitude, double maxSpeed, int passengerCapacity, String dualModeType) {
        super(manufacturer, altitude, maxSpeed, passengerCapacity);
        this.dualModeType = dualModeType;
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("Hybrid plane supports mode: [" + dualModeType + "]");
    }
}
