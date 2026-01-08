package com.qa.lab10;

public class Runner {

    public static void main(String[] args) {

        Student<Integer> alice = new Student<>("Alice");
        alice.addGrade(80);
        alice.addGrade(90);
        alice.addGrade(85);

        Student<Double> bob = new Student<>("Bob");
        bob.addGrade(60.5);
        bob.addGrade(70.0);
        bob.addGrade(65.5);

        StudentManager manager = new StudentManager();
        manager.addStudent(alice);
        manager.addStudent(bob);

        System.out.println("Alice average: " + manager.calculateAverage(alice));
        System.out.println("Bob average: " + manager.calculateAverage(bob));

        System.out.println("\nStudents above 75:");
        for (Student<? extends Number> s : manager.getStudentsAbove(75)) {
            System.out.println(" - " + s.getName());
        }
    }
}
