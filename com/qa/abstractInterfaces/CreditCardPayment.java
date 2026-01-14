package com.qa.abstractInterfaces;

public class CreditCardPayment implements PaymentProcessor {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of £" + amount + " using card ending in " + cardNumber.substring(cardNumber.length() - 4));
    }
}
