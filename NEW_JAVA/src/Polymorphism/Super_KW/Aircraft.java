package Polymorphism.Super_KW;

public class Aircraft {
    public String manufacturer;
    public double maxSpeed;
    public double altitude;

    public Aircraft(String manufacturer, double altitude, double maxSpeed) {
        this.manufacturer = manufacturer;
        this.altitude = altitude;
        this.maxSpeed = maxSpeed;
    }

    public void fly() {
        System.out.println( "Aircraft by  [" + manufacturer + "] is flying at altitude [" + altitude + "] feet with max speed [" + maxSpeed + "] km/h");
    }
}
