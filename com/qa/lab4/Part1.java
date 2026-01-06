package com.qa.lab4;

public class Part1 {

    public static void main(String[] args) {
        int[] numbers = {1, 3, -5, 7, 0, 4, 6, 8};

        int sum = 0;
        int min = numbers[0];
        int max = numbers[0];
        int zeroIndex = -1;

        for (int i = 0; i < numbers.length; i++) {
            
            sum = sum + numbers[i];

            if (numbers[i] < min) {
                min = numbers[i];
            }

            if (numbers[i] > max) {
                max = numbers[i];
            }

            if (numbers[i] == 0) {
                zeroIndex = i;
            }
        }

        double average = (double) sum / numbers.length;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Index of 0: " + zeroIndex);
    }
}
