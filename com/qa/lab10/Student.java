package com.qa.lab10;

import java.util.ArrayList;
import java.util.List;

public class Student<T extends Number> {

    private String name;
    private List<T> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public void addGrade(T grade) {
        grades.add(grade);
    }

    public List<T> getGrades() {
        return grades;
    }

    public String getName() {
        return name;
    }
}
