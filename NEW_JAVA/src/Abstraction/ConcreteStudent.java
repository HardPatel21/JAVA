package Abstraction;

public class ConcreteStudent extends AbstractPerson {
    int rollNo;

    public ConcreteStudent(String name, int age, int rollNo) {
        super(name, age);
        this.rollNo = rollNo;
    }

    @Override
    public void display() {
        System.out.println("Name: " + name + "\nAge: " + age + "\nRoll No.: " + rollNo);
    }
}