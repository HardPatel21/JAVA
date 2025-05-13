package OOPJ.inheritance.classes;

public class ServiceRecord extends  BaseEntity_2{
    private String description;
    private double cost;

    public ServiceRecord(String description, double cost) {
        this.description = description;
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "ServiceRecord{" +
                "description='" + description + '\'' +
                ", cost=" + cost +
                ", id=" + id +
                '}';
    }
}
