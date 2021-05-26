package com.udemy.section.three;

public class Operators {
    public static void print(boolean t) {
        if (t) {
            System.out.println("\n40. Operators");

            double a = 20d, b = 80d;
            System.out.println("a = " + a + "\nb = " + b);

            double c = (a + b) * 100;
            System.out.println("c = ( a + b ) * 100 = " + c);

            double d = c % 40;
            System.out.println("d = c % 40 = " + d);

            boolean e = d == 0;
            System.out.println("e is " + e);

            if (!e) {
                System.out.println("Got some remainder");
            }
        }


    }

}
