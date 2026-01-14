package com.qa.abstractInterfaces;

public class Runner {
    public static void main(String[] args) {
        
        PaymentProcessor creditCard = new CreditCardPayment("1234-5678-9012-3456");
        PaymentProcessor paypal = new PayPalPayment("user@example.com");

        System.out.println("--- Transaction 1 (Card) ---");
        ShoppingCart cart1 = new ShoppingCart(creditCard);
        cart1.addToTotal(15.50);
        cart1.addToTotal(10.00);
        cart1.checkout();

        System.out.println("\n--- Transaction 2 (PayPal) ---");
        ShoppingCart cart2 = new ShoppingCart(paypal);
        cart2.addToTotal(50.00);
        cart2.checkout();
    }
}
