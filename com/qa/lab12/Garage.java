package com.qa.lab12;

import java.util.ArrayList;
import java.util.List;

public class Garage {
    private List<Vehicle> vehicles = new ArrayList<>();

    public void addVehicle(Vehicle v) {
        vehicles.add(v);
    }

    public double calculateTotalBill() {
        double total = 0;
        for (Vehicle v : vehicles) {
            total += v.calcBill();
        }
        return total;
    }

    public void removeVehicleById(int id) {
        boolean removed = vehicles.removeIf(v -> v.getId() == id);
        
        if (removed) {
            System.out.println("Vehicle " + id + " removed from Garage.");
        } else {
            System.out.println("Could not find Vehicle " + id + " to remove.");
        }
    }

    public void printBillForVehicle(int id) {
        for (Vehicle v : vehicles) {
            if (v.getId() == id) {
                System.out.println("Bill for Vehicle " + id + ": £" + v.calcBill());
                return;
            }
        }
        System.out.println("Vehicle not found.");
    }
}
