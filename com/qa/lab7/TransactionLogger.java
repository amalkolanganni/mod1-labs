package com.qa.lab7;

import java.util.ArrayList;

public class TransactionLogger {

    private static ArrayList<String> logs = new ArrayList<>();

    public static void log(String transactionDetails) {
        logs.add(transactionDetails);
    }

    public static void printAllLogs() {
        System.out.println("\n--- TRANSACTION HISTORY ---");
        for (String log : logs) {
            System.out.println(log);
        }
    }
}
