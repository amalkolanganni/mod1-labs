package com.qa.lab3;

import java.util.Scanner;

public class ProgramDataConv {

    public static void main(String[] args) {
        theLunchQueue();
    }

    public static void theLunchQueue() {

        Utils utils = new Utils();

        String mainCourse = getString("What main dish would you like(Fish, Burgers or Veg)?");

        int potatoes = utils.getInt("How many Roast Potatoes would you like?");
        int sprouts = getInt("How many Brussel Sprouts would you like?");

        System.out.println("Hello, your lunch is " + mainCourse + " with " + potatoes + " Roast Potatoes and " + sprouts + " Brussel Sprouts.");
    }

    public static int getInt(String prompt) {
        System.out.println(prompt);
        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }

    public static String getString(String prompt) {
        System.out.println(prompt);
        Scanner s = new Scanner(System.in);
        return s.nextLine();
    }

}
