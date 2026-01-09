package com.qa.lab12;

public class Car extends Vehicle implements Washable {
    private boolean isConvertible;

    public Car(int id, String manufacturer, String model, boolean isConvertible) {
        super(id, manufacturer, model);
        this.isConvertible = isConvertible;
    }

    @Override
    public double calcBill() {
        return isConvertible ? 100.00 : 50.00;
    }

    @Override
    public void clean() {
        System.out.println("Car is going through the car wash... Sparkly!");
    }
}
