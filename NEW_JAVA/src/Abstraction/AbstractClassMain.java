package Abstraction;

import Abstraction.ConcreteStudent;
import Abstraction.AbstractPerson;

public class AbstractClassMain {
    public static void main(String[] args) {
//        AbstractPerson p = new ConcreteStudent("Hard", 19, 101);
//        p.display();

        //Anonymous Class
        new AbstractPerson("Hard", 19) {
            @Override
            public void display() {
                System.out.println("Name: " + name + "\nAge: " + age);
            }
        }.display();
    }
}
/*
Abstraction : Abstraction is a process of hiding the implementation details and showing only functionality to the user.

Abstract Class: A class with the abstract keyword is called an abstract class. It can have abstract and non-abstract methods.

0%-100% abstraction is possible in abstract class.

Rules for Abstract class:

1. must declare with abstract keyword.
2. it can have abstract and non-abstract methods.
3. it cannot be instantiated.
4. it can have constructors and static methods also.
5. it can have final methods which will force the subclass not to change the body of the method.

*/
