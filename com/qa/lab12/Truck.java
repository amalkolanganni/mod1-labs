package com.qa.lab12;

public class Truck extends Vehicle {
    private double cargoSize;

    public Truck(int id, String manufacturer, String model, double cargoSize) {
        super(id, manufacturer, model);
        this.cargoSize = cargoSize;
    }

    @Override
    public double calcBill() {
        return 200.00 + (cargoSize * 10);
    }
}
