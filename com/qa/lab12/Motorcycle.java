package com.qa.lab12;

public class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(int id, String manufacturer, String model, int topSpeed, boolean hasSidecar) {
        super(id, manufacturer, model, topSpeed);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void move() {
        System.out.println("The motorcycle weaves through traffic.");
    }

    @Override
    public void makeNoise() {
        System.out.println("Vroom Vroom!");
    }

    @Override
    public String toString() {
        return super.toString() + " | Type: Motorcycle (Sidecar: " + hasSidecar + ")";
    }
}
