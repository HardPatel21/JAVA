package Encapsulation;

public class Car {
    private String model;
    private String brand;
    protected int year;

    {
        model = "i10";
        brand  = "Hyundai";
        year = 2010;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
