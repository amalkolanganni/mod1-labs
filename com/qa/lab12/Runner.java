package com.qa.lab12;

public class Runner {
    public static void main(String[] args) {
        Garage garage = new Garage();

        Car car = new Car(1, "Ford", "Focus", false);     // Bill: 50
        Truck truck = new Truck(2, "Volvo", "Rig", 10.0); // Bill: 200 + 100 = 300
        Motorcycle bike = new Motorcycle(3, "Honda", "CBR"); // Bill: 30

        garage.addVehicle(car);
        garage.addVehicle(truck);
        garage.addVehicle(bike);

        System.out.println("--- Testing Interfaces ---");
        car.refuel();
        car.clean();
        truck.refuel();

        System.out.println("\n--- Testing Bills ---");
        garage.printBillForVehicle(1);
        garage.printBillForVehicle(2);

        System.out.println("\nTotal Garage Value: £" + garage.calculateTotalBill());

        System.out.println("\n--- Testing Removal ---");
        garage.removeVehicleById(1);
        System.out.println("New Total: £" + garage.calculateTotalBill());
    }
}
