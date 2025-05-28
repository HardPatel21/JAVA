package Polymorphism.IIB;

public class IIB_Bike extends IIB_Vehicle{
    public int speed;

    public IIB_Bike() {
        super();
        //iib
        System.out.println("speed is " + speed);
    }

    {
        // Instance Initializer Block
        System.out.println("IIB_Bike Instance Initializer Block");
        speed = 100;
    }
}
