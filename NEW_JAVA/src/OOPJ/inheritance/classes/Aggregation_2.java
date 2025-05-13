package OOPJ.inheritance.classes;

public class Aggregation_2 {
    public static void main(String[] args) {
        ServiceCenter serv = new ServiceCenter(101, "IT", 5, 10);

        Vehicle_2 v1 = new Vehicle_2("Hard", "MotorCycle");
        Vehicle_2 v2 = new Vehicle_2("Jal", "Truck");
        Vehicle_2 v3 = new Vehicle_2("Joy", "Car");

        serv.addVehicle(v1);
        serv.addVehicle(v2);
        serv.addVehicle(v3);

        ServiceRecord rc = new ServiceRecord("hi there", 60.90);

        ServiceRecord s1 = new ServiceRecord("Oil Check", 45.45);
        ServiceRecord s2 = new ServiceRecord("Fitting new Gas Kit",  1010.10);
        ServiceRecord s3 = new ServiceRecord("Tire Change", 391.3983);

        serv.addServiceRecord(s1);
        serv.addServiceRecord(s2);
        serv.addServiceRecord(s3);

        serv.listVehicles();

        serv.removeVehicle("Dirgh");

        serv.listVehicles();

        serv.setCenterName("Vijapur");
        System.out.println("Updated Service Center: " + serv);

        serv.listServiceRecord();
        serv.removeServiceRecord(1010.10);
        serv.listServiceRecord();
    }
}
