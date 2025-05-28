package Abstraction;

public class InterfaceStudent implements InterfacePerson {
    public String name;
    public int age;
    public int rollNo;

    public InterfaceStudent(String name, int age, int rollNo) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }

    @Override
    public void display() {
        System.out.println("Name: " + name + "\nAge: " + age + "\nRoll No.: " + rollNo);
    }
}