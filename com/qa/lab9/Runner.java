package com.qa.lab9;

public class Runner {

    public static void main(String[] args) {

        System.out.println("--- Creating Order ---");
        Order myOrder = new Order(101, OrderStatus.NEW);

        myOrder.printStatusMessage();
        System.out.println("Current Status: " + myOrder.getStatus());

        System.out.println("\n--- Updating Status ---");
        myOrder.setStatus(OrderStatus.SHIPPED);
        myOrder.printStatusMessage();

        System.out.println("\n--- Attempting Cancellation ---");
        myOrder.cancelOrder();

        System.out.println("\n--- Final Details ---");
        System.out.println("Status: " + myOrder.getStatus());
        System.out.println("Description: " + myOrder.getStatus().getDescription());
    }
}
