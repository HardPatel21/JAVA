package Polymorphism.Final;

public class Final_Bike {
    public int speedLimit = 80;
    public final static int blank;    // blank final variable

    static {
        blank = 90;    // static blank final variable
    }

    // Bike() {
    //     // super();
    //     // iib
    //     blank = 0;
    // }

    public void run() {
        speedLimit = 100;
    }
}
