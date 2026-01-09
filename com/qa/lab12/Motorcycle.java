package com.qa.lab12;

public class Motorcycle extends Vehicle {
    
    public Motorcycle(int id, String manufacturer, String model) {
        super(id, manufacturer, model);
    }

    @Override
    public double calcBill() {
        return 30.00;
    }
}
