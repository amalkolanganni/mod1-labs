package com.qa.lab5;

public class Program {
    public static void main(String[] args) {
        
        Account[] accounts = new Account[3];

        accounts[0] = new Account(10001, "Amal", 500.00);
        accounts[1] = new Account(10002, "Mike", 150.00);
        accounts[2] = new Account(10003, "Tom", 20.00);

        System.out.println("\n--- Account List ---");
        
        for (Account a : accounts) {
            System.out.println(a.getDetails());
        }
    }
}
