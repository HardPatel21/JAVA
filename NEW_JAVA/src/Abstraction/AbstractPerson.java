package Abstraction;

public abstract class AbstractPerson {
    public String name;
    public int age;

    public abstract void display();

    public AbstractPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }
}