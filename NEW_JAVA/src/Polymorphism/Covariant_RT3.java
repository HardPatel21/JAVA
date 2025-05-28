/*

Scenario 2: Shape Factory
In a shape factory application, define an abstract base class called "Shape" with a method called "createShape" that returns
an instance of the "Shape" class. Implement derived classes like "Circle" and "Rectangle" that override the "createShape" method
and return their specific shape objects.
*/

package Polymorphism;

public class Covariant_RT3 {
    public static void main(String[] args) {
        Shape s = new Circle();
        Shape c = s.createShape();
        c.draw();

        Shape r = new Rectangle();
        Shape p = r.createShape();
        p.draw();

        if(s instanceof Rectangle) {
            ((Rectangle) s).createShape();
        }
    }
}
