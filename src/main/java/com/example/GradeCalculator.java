package com.example;

public class GradeCalculator {

    public String getGrade(int marks) {

        if (marks < 0 || marks > 100) {
            return "Invalid";
        }

        if (marks >= 90) {
            return "A";
        } else if (marks >= 80) {
            return "B";
        } else if (marks >= 70) {
            return "C";
        } else if (marks >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}
