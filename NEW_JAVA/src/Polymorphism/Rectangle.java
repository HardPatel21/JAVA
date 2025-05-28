package Polymorphism;

public class Rectangle extends Shape{
    @Override
    public Rectangle createShape() {
        System.out.println("Shape of Rectangle");
        return new Rectangle();
    }

    @Override
    public void draw() {
        System.out.println("Draw a Rectangle");
    }
}
