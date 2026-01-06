package com.qa.lab6;

public class Program {
    public static void main(String[] args) {
        Bank myBank = new Bank();

        System.out.println("--- 1. Creating Accounts ---");

        myBank.addAccount("Amal", 100.00);
        myBank.addAccount("Bob", 200.00);
        myBank.addAccount("Charlie", 300.00);

        Account failTest = myBank.addAccount("Jane", 400.00);
        if (failTest == null) {
            System.out.println("Blocked the creation of 4th account.");
        }


        System.out.println("\n--- 2. Searching for Customers ---");
        Account bob = myBank.getAccount("Bob");
        if (bob != null) {
            System.out.println("Found Bob: " + bob.getDetails());
        }

        Account unknown = myBank.getAccount("Zoe");
        if (unknown == null) {
            System.out.println("Null: unknown customer 'Zoe'.");
        }
    }
}
