package com.qa.lab7;

public class Currency {

    private String name;
    private double rateToGBP;

    public Currency(String name, double rateToGBP) {
        this.name = name;
        this.rateToGBP = rateToGBP;
    }

    public String getName() {
        return name;
    }

    public double convertToGBP(double gbpAmount) { 
        return gbpAmount * rateToGBP; 
    }
}
