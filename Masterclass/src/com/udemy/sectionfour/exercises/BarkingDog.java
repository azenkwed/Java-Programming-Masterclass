package com.udemy.sectionfour.exercises;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        // return barking && (hourOfDay < 8 || hourOfDay > 22) && (hourOfDay >= 0 && hourOfDay < 24);
        return (hourOfDay < 8 || hourOfDay > 22) && hourOfDay >= 0 && hourOfDay < 24 && barking;
    }
}
