package com.qa.lab12;

public class Truck extends Vehicle {
    private double cargoCapacity;

    public Truck(int id, String manufacturer, String model, int topSpeed, double cargoCapacity) {
        super(id, manufacturer, model, topSpeed);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public void move() {
        System.out.println("The truck rumbles slowly down the highway.");
    }

    @Override
    public void makeNoise() {
        System.out.println("HONK HONK!");
    }

    @Override
    public String toString() {
        return super.toString() + " | Type: Truck (Capacity: " + cargoCapacity + " tons)";
    }
}
