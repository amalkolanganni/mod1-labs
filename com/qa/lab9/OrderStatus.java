package com.qa.lab9;

public enum OrderStatus {
    NEW("Order has been created", true),
    PROCESSING("Order is being prepared", true),
    SHIPPED("Order has been shipped", false),
    DELIVERED("Order delivered to customer", false),
    CANCELLED("Order was cancelled", false);

    private final String description;
    private final boolean canBeCancelled;

    OrderStatus(String description, boolean canBeCancelled) {
        this.description = description;
        this.canBeCancelled = canBeCancelled;
    }

    public String getDescription() {
        return description;
    }

    public boolean canBeCancelled() {
        return canBeCancelled;
    }
}
