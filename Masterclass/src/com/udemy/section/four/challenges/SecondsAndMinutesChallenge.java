package com.udemy.section.four.challenges;

public class SecondsAndMinutesChallenge {
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945L));
    }

    public static String getDurationString(int minutes, int seconds){
        if (minutes < 0  || seconds < 0 || seconds > 59) {
            return INVALID_VALUE_MESSAGE;
        }
        int hours = minutes / 60;
        minutes %= 60;

        return hours + "h " + minutes + "m " + seconds + "s";
    }

    public static String getDurationString(long seconds) {
        if (seconds < 0) return INVALID_VALUE_MESSAGE;

        int minutes = (int) seconds / 60;
        seconds %= 60;

        return getDurationString(minutes, (int) seconds);
    }
}
