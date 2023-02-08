package com.softserve.homework13.othertasks;

public class DateApp {

    public static void main(String[] args) {
        DateService validator = new DateService();
        System.out.println("isValidDateFormat: " + validator.isValidDateFormat("12.03.23"));
        System.out.println("isLeapYear: " + validator.isLeapYear(2001));
        validator.printBirthday();
    }
}
