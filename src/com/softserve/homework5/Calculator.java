package com.softserve.homework5;

public class Calculator {

    public static void matchMonthDays() {
        int input = InputReader.readMonth();
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int monthDay = monthDays[input - 1];
        System.out.println(monthDay);
    }

}
