package com.softserve.HomeWork_13;

import java.time.Year;

public class Task_03 {
    public boolean isLeapYear(Year year) {
        return year.isLeap();
    }

    public static void main(String[] args) {
        System.out.println(new Task_03().isLeapYear(Year.of(2024)));
    }
}
