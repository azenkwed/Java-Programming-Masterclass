package com.udemy.section.five.exercises;

public class NumberOfDaysInAMonth {
    public static void main(String[] args) {
        System.out.println("1. days = " + (getDaysInMonth(1, 2020)));
        System.out.println("2. days = " + (getDaysInMonth(2, 2020)));
        System.out.println("3. days = " + (getDaysInMonth(2, 2021)));
        System.out.println("3. days = " + (isLeapYear(-1024)));
    }

    public static boolean isLeapYear(int year) {
        return (year >= 1 && year <= 9999)
                && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
    }

    public static int getDaysInMonth(int month, int year) {

        int days = -1;

        if (month >= 1 && month <= 12) {

            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    days = 31;
                    break;

                case 4:
                case 6:
                case 9:
                case 11:
                    days = 30;
                    break;

                case 2:
                    days = isLeapYear(year) ? 29 : 28;
                    break;
            }
        }

        return days;
    }

}
