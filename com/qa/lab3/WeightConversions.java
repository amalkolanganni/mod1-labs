package com.qa.lab3;

import java.util.Scanner;

public class WeightConversions {

    public static void main(String[] args) {

        int lbs = getInt("Enter a value for pounds:");
        convertInputToStonesPounds(lbs);

        int kgs = getInt("Enter a value for kg:");
        convertKgsToStonesPounds(kgs);
    }

    public static void convertInputToStonesPounds(int pounds) {

        int stones = pounds / 14;       
        int remaining = pounds % 14;    
        System.out.println(pounds + " lbs is " + stones + " stone and " + remaining + " pounds.");
    }

    public static void convertKgsToStonesPounds(int kg) {

        int pounds = (int) (kg * 2.20462); 
        
        System.out.println(kg + " kg is approximately " + pounds + " lbs.");

        convertInputToStonesPounds(pounds);
    }

    public static int getInt(String prompt) {
        System.out.println(prompt);
        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }

}
