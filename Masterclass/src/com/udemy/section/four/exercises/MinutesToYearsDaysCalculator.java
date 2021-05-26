package com.udemy.section.four.exercises;

public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long minutes) {
        //long days =  minutes / 1440;
        long years= minutes / 1440 / 365 ;
        long days = (minutes / 1440) % 365;
        System.out.println(
                minutes < 0
                ? "Invalid Value"
                : minutes + " min = " + years + " y and " + days + " d");
    }

    public static void main(String[] args) {
        printYearsAndDays(0);
        printYearsAndDays(1440);
        printYearsAndDays(525600);
        printYearsAndDays(1000000);
    }
}
