package Polymorphism;

import Polymorphism.Dog;

public class Method_Overriding {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.callParentEat();
    }
}
