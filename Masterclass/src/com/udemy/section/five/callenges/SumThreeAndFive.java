package com.udemy.section.five.callenges;

import java.util.stream.IntStream;

public class SumThreeAndFive {

    public static void main(String[] args) {

        long startTime = System.nanoTime();
        int sum = 0;

        for (int i = 0; i < 1_000_000_000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
            }
        }
        // System.out.println(sum);

        long endTime = System.nanoTime();

        long ns1 = endTime - startTime;
        System.out.println("1. time = " + ns1 + " ns");

        startTime = System.nanoTime();
        IntStream.range(0, 1_000_000_000).parallel()
                .filter(num -> num % 3 == 0 && num % 5 == 0)
                .sum();
        endTime = System.nanoTime();

        long ns2 = endTime - startTime;

        System.out.println("2. time = " + ns2 + " ns");

        float result = (float)((ns1 - ns2) / ns2) * 100f;
        System.out.println("performance: +" + result + " %");



    }
}
