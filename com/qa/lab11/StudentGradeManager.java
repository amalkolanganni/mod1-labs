package com.qa.lab11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentGradeManager {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- New Entry ---");
            try {
                System.out.print("Enter student name: ");
                String name = scanner.nextLine();

                if (name.equalsIgnoreCase("exit")) {
                    System.out.println("Goodbye!");
                    break;
                }

                System.out.print("Enter grade (0-100): ");

                int grade = scanner.nextInt(); 

                scanner.nextLine(); 

                checkGrade(grade);

                System.out.println("Success: Student " + name + " has grade " + grade);

            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid input. Please enter a number.");
                scanner.nextLine();
            
            } catch (InvalidGradeException e) {
                System.out.println("Error: " + e.getMessage());
            
            } catch (Exception e) {
                System.out.println("Error: Something went wrong.");
            
            } finally {
                System.out.println("...Operation Attempted...");
            }
        }
        
        scanner.close();
    }

    public static void checkGrade(int grade) throws InvalidGradeException {
        if (grade < 0 || grade > 100) {
            throw new InvalidGradeException("Grade must be between 0 and 100. You entered: " + grade);
        }
    }
}
