package Polymorphism.Super_KW;

import Polymorphism.Manager;

public class Super_KW {
    public static void main(String[] args) {
        Manager mgr = new Manager(80000);

        mgr.work();
        mgr.displaySalary();
        mgr.showNames();
    }
}
