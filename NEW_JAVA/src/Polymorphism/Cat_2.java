package Polymorphism;

public class Cat_2 extends Animal_2{
    @Override
    public Cat_2 makeSound() {
        System.out.println("Cat Sound!");
        return new Cat_2();
    }
}
