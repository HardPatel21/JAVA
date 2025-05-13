package OOPJ.inheritance.classes;

import java.util.Arrays;

public class ServiceCenter extends BaseEntity_2{
    private String centerName;
    private Vehicle_2[] vehicles = new Vehicle_2[5];
    private ServiceRecord[] serviceRecords = new ServiceRecord[10];
    private int vehicleCount;
    private int serviceRecordCount;

    public ServiceCenter(int id, String centerName, int maxVehicles, int maxServiceRecord) {
        this.id = id;
        this.centerName = centerName;
        this.vehicles= new Vehicle_2[maxVehicles];
        this.vehicleCount = 0;
        this.serviceRecords = new ServiceRecord[maxServiceRecord];
        this.serviceRecordCount = 0;
    }

    public void addVehicle(Vehicle_2 veh) {
        if (vehicleCount < vehicles.length) {
            vehicles[vehicleCount++] = veh;
            System.out.println("Added: " + veh.getVehicleType());
        } else {
            System.out.println("Cannot add more vehicles.");
        }
    }

    public void addServiceRecord(ServiceRecord ser) {
        if (serviceRecordCount < serviceRecords.length) {
            serviceRecords[serviceRecordCount++] = ser;
            System.out.println("Added: " + ser.getDescription() + ser.getCost());
        } else {
            System.out.println("Cannot add more ServiceRecords.");
        }
    }

    public void removeVehicle(String owner_name) {
        boolean found = false;
        for (int i=0; i<vehicleCount; i++) {
            if (vehicles[i] != null && vehicles[i].getOwnerName() == owner_name) {
                for (int j = i; j < vehicleCount - 1; j++) {
                    vehicles[j] = vehicles[j+1];
                }
                vehicles[--vehicleCount] = null;
                found = true;
                System.out.println("Removed vehicle by owner name: " + owner_name);
                break;
            }
        }
        if (!found) {
            System.out.println("vehicle with owner name not found.");
        }
    }

    public void removeServiceRecord(double cost) {
        boolean found = false;
        for (int i=0; i<serviceRecordCount; i++) {
            if (serviceRecords[i] != null && serviceRecords[i].getCost() == cost) {
                for (int j = i; j < serviceRecordCount - 1; j++) {
                    serviceRecords[j] = serviceRecords[j+1];
                }
                serviceRecords[--serviceRecordCount] = null;
                found = true;
                System.out.println("Removed service record by cost: " + cost);
                break;
            }
        }
        if (!found) {
            System.out.println("service record with cost not found.");
        }
    }

    public void listVehicles() {
        System.out.println("Vehicles in Service center " + centerName + ":");
        for (int i=0; i<vehicleCount; i++) {
            System.out.println(vehicles[i]);
        }
    }

    public void listServiceRecord() {
        System.out.println("Service Records in Service center " + centerName + ":");
        for (int i=0; i<serviceRecordCount; i++) {
            System.out.println(serviceRecords[i]);
        }
    }

    public void setCenterName(String centerName) {
        this.centerName = centerName;
    }

    @Override
    public String toString() {
        return "ServiceCenter{" +
                "id=" + id +
                ", centerName='" + centerName + '\'' +
                '}';
    }
}
