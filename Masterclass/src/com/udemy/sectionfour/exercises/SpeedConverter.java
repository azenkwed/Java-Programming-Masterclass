// https://www.udemy.com/course/java-the-complete-java-developer-course/learn/quiz/4585756#questions
package com.udemy.sectionfour.exercises;

import org.w3c.dom.ls.LSOutput;

public class SpeedConverter {

    private static double MPH = 1.609d;

    public static long toMilesPerHour(double kilometersPerHour){
        return (kilometersPerHour < 0)
                ? -1
                : Math.round(kilometersPerHour / MPH);
    }

    public static void printConversion(double kilometersPerHour) {
        System.out.println(
                kilometersPerHour < 0
                ? "Invalid Value"
                : kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h"
        );
    }

}
