package com.qa.lab9;

public class Order {

    private int orderId;
    private OrderStatus status;

    public Order(int orderId, OrderStatus status) {
        this.orderId = orderId;
        this.status = status;
    }

    public int getOrderId() {
        return orderId;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void cancelOrder() {
        if (status.canBeCancelled()) {
            this.status = OrderStatus.CANCELLED;
            System.out.println("Order #" + orderId + " has been cancelled.");
        } else {
            System.out.println("Order #" + orderId + " cannot be cancelled in its current state.");
        }
    }

    public void printStatusMessage() {
        switch (status) {
            case NEW:
                System.out.println("Order placed. We will start processing soon.");
                break;
            case PROCESSING:
                System.out.println("We are packing your items.");
                break;
            case SHIPPED:
                System.out.println("Your order is on the way!");
                break;
            case DELIVERED:
                System.out.println("Thank you for shopping with us!");
                break;
            case CANCELLED:
                System.out.println("This order is invalid.");
                break;
            default:
                System.out.println("Unknown status.");
        }
    }
}
