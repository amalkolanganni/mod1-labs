package com.qa.lab2;

public class Program {
    public static void main(String[] args) {
        
        int mark = 50;

        if (mark < 1 || mark > 100) {
            System.out.println("Error: marks must be between 1..100");
        }
        else if (mark < 50) {
            System.out.println("Fail");
        } 
        else if (mark >= 50 && mark <= 60) {
            System.out.println("Pass");
        } 
        else if (mark >= 61 && mark <= 70) {
            System.out.println("Merit");
        } 
        else {
            System.out.println("Distinction");
        }
    }
}
