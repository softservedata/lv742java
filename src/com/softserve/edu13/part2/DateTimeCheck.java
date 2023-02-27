package com.softserve.edu13.part2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Year;

public class DateTimeCheck {
    public static boolean isValidDate(String dateStr) {
        // Check length
        if (dateStr.length() != 8) {
            return false;
        }

        try {
            // Parse the date string to a Date object using SimpleDateFormat
            SimpleDateFormat dateFormat = new SimpleDateFormat("MM.dd.yy");
            dateFormat.setLenient(false);
            dateFormat.parse(dateStr);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
    public static boolean isLeap(int year){
        return Year.of(year).isLeap();
    }

    public static void dayOfTheWeek(LocalDate date){
        System.out.println("Local date: " + date.getDayOfWeek());

        System.out.println("After 6 months: " + date.plusMonths(6).getDayOfWeek());

        System.out.println("After 12 months: " + date.plusYears(1).getDayOfWeek());
    }
}
