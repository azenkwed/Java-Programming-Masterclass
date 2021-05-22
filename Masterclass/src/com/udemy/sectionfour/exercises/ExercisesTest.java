// testing exercises
package com.udemy.sectionfour.exercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExercisesTest {

    @Test
    @DisplayName("Exercise 5: Test DecimalComparator exercise")
    public void testDecimalComparator() {
        assertTrue(DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        assertTrue(DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0));
        assertFalse(DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176));
        assertFalse(DecimalComparator.areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }

    @Test
    @DisplayName("Exercise 6: Equal Sum Checker")
    public void testEqualSumChecker() {
        assertFalse(EqualSumChecker.hasEqualSum(1, 1, 1));
        assertTrue(EqualSumChecker.hasEqualSum(1, 1, 2));
        assertTrue(EqualSumChecker.hasEqualSum(1, 1, 2));
    }

    @Test
    @DisplayName("Exercise 7: Teen Number Checker - hasTeen()")
    public void testHasTeen() {
        assertTrue(TeenNumberChecker.hasTeen(9, 99, 19));
        assertTrue(TeenNumberChecker.hasTeen(23, 15, 42));
        assertFalse(TeenNumberChecker.hasTeen(22, 23, 34));
    }

    @Test
    @DisplayName("Exercise 7: Teen Number Checker - isTeen()")
    public void testisTeen() {
        assertFalse(TeenNumberChecker.isTeen(9));
        assertTrue(TeenNumberChecker.isTeen(13));
        assertFalse(TeenNumberChecker.isTeen(22));
    }

    @Test
    @DisplayName("Exercise 8: Area Calculator")
    public void testAreaCalculator() {
        assertEquals(78.53981633974483, AreaCalculator.area(5.0));
        assertEquals(-1, AreaCalculator.area(-1));
        assertEquals(20.0, AreaCalculator.area(5.0, 4.0));
        assertEquals(-1, AreaCalculator.area(-1.0, 4.0));
    }

    @Test
    @DisplayName("Exercise 10: Equality Printer")
    public void testEqualityPrinter() {
        assertEquals("All numbers are equal",
                IntEqualityPrinter.printEqual(1, 1, 1));
        assertEquals("All numbers are different",
                IntEqualityPrinter.printEqual(1, 2, 3));
        assertEquals("Neither all are equal or different",
                IntEqualityPrinter.printEqual(1, 1, 2));
        assertEquals("Invalid Value",
                IntEqualityPrinter.printEqual(-1, 1, 2));
    }

    @Test
    @DisplayName("Exercise 11: Playing Cat")
    public void testPlayingCat() {
        assertFalse(PlayingCat.isCatPlaying(true, 10));
        assertFalse(PlayingCat.isCatPlaying(false, 36));
        assertTrue(PlayingCat.isCatPlaying(false, 35));
    }
}
