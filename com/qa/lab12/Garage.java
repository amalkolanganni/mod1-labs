package com.qa.lab12;

import java.util.ArrayList;
import java.util.List;

public class Garage {
    private List<Vehicle> vehicles = new ArrayList<>();

    public void addVehicle(Vehicle v) {
        vehicles.add(v);
        System.out.println("Added vehicle: " + v.getId());
    }

    public Vehicle findVehicleById(int id) throws VehicleNotFoundException {
        for (Vehicle v : vehicles) {
            if (v.getId() == id) {
                return v;
            }
        }
        throw new VehicleNotFoundException("Vehicle with ID " + id + " not found in Garage.");
    }

    public void printVehiclesByType(Class<?> type) {
        System.out.println("\n--- Searching for " + type.getSimpleName() + " ---");
        for (Vehicle v : vehicles) {
            if (type.isInstance(v)) {
                System.out.println(v);
            }
        }
    }
    
    public void printAll() {
        System.out.println("\n--- Garage Contents ---");
        for(Vehicle v : vehicles) {
            System.out.println(v);
        }
    }
}
