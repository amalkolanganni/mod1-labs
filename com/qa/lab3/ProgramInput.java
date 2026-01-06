package com.qa.lab3;

import java.util.Scanner;

public class ProgramInput {

    public static void main(String[] args) {

        String name = getString("Please enter your name:");
        int age = getInt("Please enter your age:");

        System.out.println("Hello " + name + ", you are " + age + " years old.");
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