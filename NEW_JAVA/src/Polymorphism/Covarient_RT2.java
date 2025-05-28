/*
Scenario 1: Animal Sounds
In an animal sounds application, create a base class called "Animal" with a method called "makeSound" that returns an instance of the "Sound" class. Implement derived classes like "Dog" and "Cat" that override the "makeSound" method and return their specific sound objects.
*/
package Polymorphism;

public class Covarient_RT2 {
    public static void main(String[] args) {
        Cat_2 c = new Cat_2();
        Animal_2 a = new Animal_2();

        a.makeSound();

        if (a instanceof Cat_2) {
            ((Cat_2) a).makeSound();
        }
    }
}
