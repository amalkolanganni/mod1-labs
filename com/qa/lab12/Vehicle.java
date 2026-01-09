package com.qa.lab12;

public abstract class Vehicle implements Refuelable {
    
    private int id;
    private String manufacturer;
    private String model;
    
    public Vehicle(int id, String manufacturer, String model) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public int getId() { return id; }
    
    public abstract double calcBill();
    
    @Override
    public void refuel() {
        System.out.println("Vehicle is refueling at the station.");
    }
}
