package OOPJ.inheritance.classes;

public class Vehicle_2 extends BaseEntity_2{
    private String ownerName;
    private String vehicleType;

    public Vehicle_2(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    @Override
    public String toString() {
        return "Vehicle_2{" +
                "ownerName='" + ownerName + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", id=" + id +
                '}';
    }
}
