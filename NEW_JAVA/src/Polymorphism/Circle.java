package Polymorphism;

public class Circle extends Shape{
    @Override
    public Shape createShape() {
        System.out.println("Shape of Circle");
        return new Circle();
    }

    @Override
    public void draw() {
        System.out.println("Draw a Circle");
    }
}
