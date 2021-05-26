package com.udemy.section.five;

public class Main {
    public static void main(String[] args) {

        int count = 0;
        for (int i = 0; i < 100; i++) {
            if (isPrime(i) && count < 3) {
                System.out.printf(i + " ");
                count++;
            }
            // if (count == 3) break;
        }

        System.out.println("\n\n.:: SWITCH ::.");
        /* SWTICH */
        int v = 3;
        switch (v) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            default:
                System.out.println("Value was not 1 or 2");
                break;
        }

    }

    public static boolean isPrime(int n) {

        if (n == 1) return false;

        for (int i = 2; i < n >> 1; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }
}
