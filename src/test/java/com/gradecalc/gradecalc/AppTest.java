package com.gradecalc.gradecalc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void testGradeA() {
        assertEquals("A", App.calculateGrade(95));
    }

    @Test
    void testGradeB() {
        assertEquals("B", App.calculateGrade(80));
    }

    @Test
    void testGradeC() {
        assertEquals("C", App.calculateGrade(65));
    }

    @Test
    void testGradeFail() {
        assertEquals("Fail", App.calculateGrade(30));
    }
}