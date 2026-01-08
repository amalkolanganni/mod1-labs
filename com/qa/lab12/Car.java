package com.qa.lab12;

public class Car extends Vehicle {
    private boolean isConvertible;

    public Car(int id, String manufacturer, String model, int topSpeed, boolean isConvertible) {
        super(id, manufacturer, model, topSpeed);
        this.isConvertible = isConvertible;
    }

    public boolean isConvertible() { return isConvertible; }

    @Override
    public void move() {
        System.out.println("The car drives smoothly on the road.");
    }

    @Override
    public void makeNoise() {
        System.out.println("Beep Beep!");
    }

    @Override
    public String toString() {
        String roofType = isConvertible ? "Convertible" : "Hardtop";
        return super.toString() + " | Type: Car (" + roofType + ")";
    }
}
