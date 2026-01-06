package com.qa.lab4;

public class Part2 {

    public static void main(String[] args) {

        String[] students = { "Amal", "Emily", "Charlie", "David", "Sarah" };
        int[] marks = { 69, 45, 52, 120, 87 };

        for (int i = 0; i < students.length; i++) {
            
            String name = students[i];
            int mark = marks[i];

            String grade = getGrade(mark);

            System.out.println(name + " scored " + mark + " which is a: " + grade);
        }
    }

    public static String getGrade(int mark) {
        
        if (mark < 1 || mark > 100) {
            return "Error: Invalid mark";
        } 
        else if (mark < 50) {
            return "Fail";
        } 
        else if (mark >= 50 && mark <= 60) {
            return "Pass";
        } 
        else if (mark >= 61 && mark <= 70) {
            return "Merit";
        } 
        else {
            return "Distinction";
        }
    }
}
