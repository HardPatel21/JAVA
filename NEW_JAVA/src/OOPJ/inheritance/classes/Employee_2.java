package OOPJ.inheritance.classes;

public class Employee_2 extends BaseEntity{
    private String name;

    public Employee_2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
