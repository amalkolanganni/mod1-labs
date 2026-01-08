package com.qa.lab12;

public class Vehicle {
    private int id;
    private String manufacturer;
    private String model;
    private int topSpeed;

    public Vehicle(int id, String manufacturer, String model, int topSpeed) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.model = model;
        this.topSpeed = topSpeed;
    }

    public Vehicle() {
        this(0, "Unknown", "Unknown", 0);
    }

    public void move() {
        System.out.println("The vehicle moves along.");
    }

    public void makeNoise() {
        System.out.println("The vehicle makes a generic engine sound.");
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getManufacturer() { return manufacturer; }
    public void setManufacturer(String manufacturer) { this.manufacturer = manufacturer; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public int getTopSpeed() { return topSpeed; }
    public void setTopSpeed(int topSpeed) { this.topSpeed = topSpeed; }

    @Override
    public String toString() {
        return "ID: " + id + " | " + manufacturer + " " + model + " (Max: " + topSpeed + "mph)";
    }
}
