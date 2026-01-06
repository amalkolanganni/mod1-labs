package com.qa.lab4;

public class Part3 {

    public static void main(String[] args) {

        account();
    }

    public static void account() {
        double money = 100;
        double target = 200;
        double interestRate = 0.05;
        int years = 0;

        while (money < target) {
            
            money = money + (money * interestRate);
            
            years++;
            
            System.out.println("Year " + years + ": £" + String.format("%.2f", money));
        }

        System.out.println("It takes " + years + " years to reach £" + String.format("%.2f", money));
    }
}
