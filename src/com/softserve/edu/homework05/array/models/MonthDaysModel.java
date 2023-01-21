package com.softserve.edu.homework05.array.models;

public class MonthDaysModel {
    public int getMonthDays(int monthNumber) {
        int monthDays[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int monthDay = monthDays[monthNumber - 1];

        return monthDay;
    }

    public final String getMessage() {
        return "The number of days in a month is ";
    }
}
