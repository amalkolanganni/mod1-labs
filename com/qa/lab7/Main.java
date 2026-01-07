package com.qa.lab7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean running = true;

        Currency usd = new Currency("USD", 1.27);
        Currency eur = new Currency("EUR", 1.15);

        System.out.println("=== AIRPORT CURRENCY EXCHANGE ===");

        while (running) {
            try {

                System.out.print("\nEnter Customer Name: ");
                String name = scan.next();
                
                System.out.print("Enter Age: ");
                int age = scan.nextInt();

                System.out.print("Is customer VIP? (true/false): ");
                boolean isVip = scan.nextBoolean();

                Customer cust = new Customer(name, age, isVip);

                System.out.println("Choose Currency to Convert to: 1. USD | 2. EUR");
                int choice = scan.nextInt();
                Currency selectedCurrency;

                if (choice == 1) selectedCurrency = usd;
                else selectedCurrency = eur;

                System.out.print("Enter Amount in GBP: ");
                double amount = scan.nextDouble();

                if (amount < 0) {
                    System.out.println("Error: Cannot exchange negative money.");
                    continue;
                }

                ExchangeTransaction trans = new ExchangeTransaction(cust, selectedCurrency, amount);
                trans.processTransaction();

                System.out.print("Process another? (Yes/No): ");
                String again = scan.next();
                if (again.equalsIgnoreCase("no")) {
                    running = false;
                }

            } catch (Exception e) {
                System.out.println("Error: Invalid input. Please try again.");
                scan.nextLine();
            }
        }

        TransactionLogger.printAllLogs();
        scan.close();
    }
}
