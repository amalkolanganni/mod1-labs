package com.qa.lab6;

public class Account {
    private int id;
    private String owner;
    private double balance;

    public Account(int id, String owner, double balance) {
        this.id = id;
        this.owner = owner;
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Error: Cannot deposit negative amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Error: Insufficient funds");
        } else if (amount < 0) {
            System.out.println("Error: Cannot withdraw a negative amount");
        } else {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        }
    }

    public void addInterest() {
        balance = balance + (balance * 0.025);
        System.out.println("Interest added. New balance: " + balance);
    }

    public String getDetails() {
        return "ID: " + id + " | Owner: " + owner + " | Balance: £" + balance;
    }
}
