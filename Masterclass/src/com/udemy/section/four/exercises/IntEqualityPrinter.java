package com.udemy.section.four.exercises;

public class IntEqualityPrinter {
    private static String[] MESSAGES = {
            "All numbers are equal",
            "Neither all are equal or different",
            "All numbers are different",
            "Invalid Value"
    };

    public static String printEqual(int a, int b, int c) {
        
        boolean anyNegative = (a < 0 || b < 0 || c < 0);
        boolean allEquals = (a == c && b == c);
        boolean anyEquals = (a == b || b == c || a == c);
        
        int message = anyNegative ? 3 : allEquals ? 0 : anyEquals ? 1 : 2;
        
        return MESSAGES[message];
    }
}
