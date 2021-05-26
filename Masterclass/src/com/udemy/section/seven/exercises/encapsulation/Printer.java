/*
 * Copyright (c) 2021. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.udemy.section.seven.exercises.encapsulation;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int pagesPrinted, boolean duplex) {
        this.pagesPrinted = duplex ? pagesPrinted / 2 : pagesPrinted;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount < 100) {
            if (tonerLevel + tonerAmount > 100) return -1;
            else tonerLevel += tonerAmount;
        }
        return tonerLevel;
    }

    public int printPages(int pages) {
        return pages;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
