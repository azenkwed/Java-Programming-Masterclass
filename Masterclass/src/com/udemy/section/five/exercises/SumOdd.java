package com.udemy.section.five.exercises;

public class SumOdd {

    public static void main(String[] args) {
        System.out.println(sumOdd(10, 5));
        System.out.println(sumOdd(-4, 6));
        System.out.println(sumOdd(4, -6));
    }

    public static boolean isOdd(int number) {
        return (number & 1) != 1 && number > 0;
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;

        if (start < 0 || end < 0) return -1;
        if (start < end) return -1;

        for (int i = start; i <= end; i++)
            if (isOdd(i)) sum += i;


        return sum;
    }
}
