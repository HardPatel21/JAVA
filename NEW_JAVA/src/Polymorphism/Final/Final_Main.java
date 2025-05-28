package Polymorphism.Final;

import  Polymorphism.Final.Final_Bike;
import  Polymorphism.Final.Final_Cyclist;

public class Final_Main {
    public static void main(String[] args) {
        Final_Bike bike = new Final_Bike();
        System.out.println(bike.speedLimit);
        bike.run();
        System.out.println(bike.speedLimit);

        Final_Bike bike1 = new Final_Cyclist();     // upcasting
        System.out.println(bike1 instanceof Final_Bike);
        Final_Cyclist b = (Final_Cyclist) bike1;    // downcasting
        System.out.println(b instanceof Final_Cyclist);
    }
}
/*
Final Keyword is used to restrict the user:
    > value change
    > method override
    > inheritance

-> instanceof is a keyword that is used for checking if a reference variable is containing a given type of object reference or not.
-> Upcasting and downcasting
- Upcasting: Converting a subclass reference to a superclass reference is called upcasting.
- Downcasting: Converting a superclass reference to a subclass reference is called downcasting.

*/