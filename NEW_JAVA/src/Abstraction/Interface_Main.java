package Abstraction;

import Abstraction.InterfacePerson;
import Abstraction.InterfaceStudent;

public class Interface_Main {
    public static void main(String[] args) {
//        InterfaceStudent student = new InterfaceStudent("Hard", 20, 230);
//        student.display();

        // Anonymous Class
        new InterfacePerson() {
            @Override
            public void display() {
                System.out.println("Interface");
            }
        }.display();
    }
}
/*
Interface: Interface in Java is a blueprint of a class. It has static constants and abstract methods only.
> 100% abstraction is possible in interface.

Points to remember:
1. Interface in Java is a blueprint of a class. It has static constants and abstract methods only.
2. the data members of interface are public, static and final by default.
3. no need to use abstract keyword with methods.
4. it cannot be instantiated.
5. it can only be implemented by those classes which inherit it.
6. it cannot have constructors.

*/