package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GradeCalculatorTest {

    GradeCalculator calculator = new GradeCalculator();

    @Test
    void testGradeA() {
        assertEquals("A", calculator.getGrade(95));
    }

    @Test
    void testGradeB() {
        assertEquals("B", calculator.getGrade(85));
    }

    @Test
    void testGradeC() {
        assertEquals("C", calculator.getGrade(75));
    }

    @Test
    void testGradeD() {
        assertEquals("D", calculator.getGrade(65));
    }

    @Test
    void testGradeF() {
        assertEquals("F", calculator.getGrade(50));
    }

    @Test
    void testInvalidLowMarks() {
        assertEquals("Invalid", calculator.getGrade(-1));
    }

    @Test
    void testInvalidHighMarks() {
        assertEquals("Invalid", calculator.getGrade(101));
    }
}
