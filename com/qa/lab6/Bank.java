package com.qa.lab6;

public class Bank {
    private Account[] accounts = new Account[3];
    
    private int count = 0;
    private int nextId = 1;

    public Account addAccount(String owner, double balance) {

        if (count < accounts.length) {

            Account newAcc = new Account(nextId, owner, balance);
            
            accounts[count] = newAcc;
            
            count++;
            nextId++;
            
            System.out.println("Success: Account created for " + owner);
            return newAcc;
        } else {
            System.out.println("Error: Bank is full. Cannot add " + owner);
            return null;
        }
    }

    public Account getAccount(String owner) {

        for (int i = 0; i < count; i++) {

            if (accounts[i].getOwner().equals(owner)) {
                return accounts[i];
            }
        }
        return null;
    }
}
