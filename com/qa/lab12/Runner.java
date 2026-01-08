package com.qa.lab12;

public class Runner {
    public static void main(String[] args) {
        Garage garage = new Garage();

        Vehicle v1 = new Car(101, "Ford", "Mustang", 150, true);
        Vehicle v2 = new Truck(102, "Volvo", "FH16", 90, 20.5);
        Vehicle v3 = new Motorcycle(103, "Ducati", "Panigale", 180, false);
        Vehicle v4 = new Car(104, "Toyota", "Prius", 100, false);

        garage.addVehicle(v1);
        garage.addVehicle(v2);
        garage.addVehicle(v3);
        garage.addVehicle(v4);

        garage.printAll();

        System.out.println("\n--- Testing Noises ---");
        v1.makeNoise();
        v2.makeNoise();
        v3.makeNoise();

        System.out.println("\n--- Testing Search ---");
        try {
            Vehicle found = garage.findVehicleById(102);
            System.out.println("Found: " + found.getManufacturer());

            System.out.println("Searching for invalid ID...");
            garage.findVehicleById(999);

        } catch (VehicleNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }

        garage.printVehiclesByType(Car.class);
    }
}
