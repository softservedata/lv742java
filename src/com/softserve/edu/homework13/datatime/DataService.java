package com.softserve.edu.homework13.datatime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DataService {

    public static boolean isValidDateFormat(String dateStr) {
        try {
            LocalDate.parse(dateStr, DateTimeFormatter.ofPattern("MM.dd.yy"));
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }

    public static boolean isLeapYear(int year) {
        return Year.of(year).isLeap();
    }

    public static void printDayOfWeek(LocalDate date){
        System.out.println("The day of the week on " + date.format(DateTimeFormatter.ISO_LOCAL_DATE) +
                " is " + date.getDayOfWeek());

        LocalDate sixMonthsLater = date.plusMonths(6);
        System.out.println("The day of the week on " + sixMonthsLater
                .format(DateTimeFormatter.ISO_LOCAL_DATE) +
                " is " + sixMonthsLater.getDayOfWeek());

        LocalDate twelveMonthsLater = date.plusMonths(12);
        System.out.println("The day of the week on " + twelveMonthsLater
                .format(DateTimeFormatter.ISO_LOCAL_DATE) +
                " is " + twelveMonthsLater.getDayOfWeek());
    }
}
