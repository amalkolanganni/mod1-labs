package com.qa.lab5;

public class Program2 {
    public static void main(String[] args) {

        System.out.println("\n--- Experiment 1: Direct Access ---");
        Account myAccount = new Account(101, "Amal", 100.00);
        
        myAccount.addInterest(); 
        System.out.println(myAccount.getDetails());

        System.out.println("\n--- Experiment 2: Partner Account ---");
        Account partnerAccount = myAccount;
        
        partnerAccount.addInterest();
        System.out.println("My Account Details: " + myAccount.getDetails());  

        System.out.println("\n--- Experiment 3: Method Reference ---");
        processAccount(myAccount);
        System.out.println(myAccount.getDetails());

        System.out.println("\n--- Experiment 4: Primitive int ---");
        int k = 100;
        incInt(k);
        System.out.println("Value of k: " + k);
    }

    public static void processAccount(Account acc) {
        acc.addInterest();
    }

    private static void incInt(int x) {
        x++;
    }
}
