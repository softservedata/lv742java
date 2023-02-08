package com.softserve.homework13.othertasks;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateService {

    public boolean isValidDateFormat(String date) {
        boolean valid;
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM.dd.yy");
        try {
            LocalDate.parse(date, dateTimeFormatter);
            valid = true;
        } catch (DateTimeParseException e) {
            e.printStackTrace();
            valid = false;
        }
        return valid;
    }

    public boolean isLeapYear(int year) {
        boolean valid;
        LocalDate time = LocalDate.now();
        LocalDate localDate = time.withYear(year);
        valid = localDate.isLeapYear();
        return valid;
    }

    public void printBirthday() {
        LocalDate birthday = LocalDate.of(1997, 1, 24);
        LocalDate date6 = birthday.plusMonths(6);
        String date6Str = date6.getDayOfWeek().toString();
        String birthdayStr = birthday.getDayOfWeek().toString();
        LocalDate date12 = birthday.plusMonths(12);
        String date12Str = date12.getDayOfWeek().toString();
        System.out.println("My birthday week day: " + birthdayStr);
        System.out.println("6-month later week day: " + date6Str);
        System.out.println("12-month later week day: " + date12Str);
    }
}
