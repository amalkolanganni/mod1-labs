package com.qa.abstractInterfaces;

public class ShoppingCart {
    
    private PaymentProcessor paymentProcessor;
    private double totalAmount;

    public ShoppingCart(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
        this.totalAmount = 0;
    }

    public void addToTotal(double price) {
        this.totalAmount += price;
        System.out.println("Added item. Total is now: £" + totalAmount);
    }

    public void checkout() {
        paymentProcessor.processPayment(totalAmount);
        
        this.totalAmount = 0;
    }
}
