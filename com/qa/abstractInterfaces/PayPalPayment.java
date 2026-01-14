package com.qa.abstractInterfaces;

public class PayPalPayment implements PaymentProcessor {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Redirecting to PayPal...");
        System.out.println("Paid £" + amount + " using account: " + email);
    }
}
