package OOPJ.inheritance.classes;

import OOPJ.inheritance.classes.Manager_1;
import OOPJ.inheritance.classes.Intern;

public class Heirarchical_3 {
    public static void main(String[] args) {
        System.out.println("---------Creating Manager_1 object----------");
        Manager_1 m = new Manager_1(101, "John Doe", 404);
        m.showManager_1Details();
        m.showEmployee_1Details();

        System.out.println("---------Creating Intern object----------");
        Intern i = new Intern(101, "John Doe", 15000);
        i.showInternDetails();
        i.showEmployee_1Details();
    }
}
