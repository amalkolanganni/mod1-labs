package com.qa.lab10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentManager {

    private Map<String, Student<? extends Number>> students;

    public StudentManager() {
        students = new HashMap<>();
    }

    public void addStudent(Student<? extends Number> student) {
        students.put(student.getName(), student);
    }

    public double calculateAverage(Student<? extends Number> student) {
        List<? extends Number> grades = student.getGrades();
        
        if (grades.isEmpty()) {
            return 0.0;
        }

        double sum = 0.0;
        for (Number grade : grades) {
            sum += grade.doubleValue();
        }

        return sum / grades.size();
    }

    public List<Student<? extends Number>> getStudentsAbove(double threshold) {
        List<Student<? extends Number>> result = new ArrayList<>();

        for (Student<? extends Number> s : students.values()) {
            if (calculateAverage(s) > threshold) {
                result.add(s);
            }
        }
        return result;
    }
}
