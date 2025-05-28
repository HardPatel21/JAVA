package Polymorphism;

public class Dog_2 extends Animal_2{
    @Override
    public Dog_2 makeSound() {
        System.out.println("Dog Sound!");
        return new Dog_2();
    }
}
