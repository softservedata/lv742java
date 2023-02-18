package com.softserve.HomeWork_13;

import java.time.LocalDate;

public class Task_04 {
    public void theDayOfTheWeek(LocalDate localDate) {
        System.out.println("The day of the week: " + localDate.getDayOfWeek());
        System.out.println("The day of the week after 6 months: " + localDate.plusMonths(6).getDayOfWeek());
        System.out.println("The day of the week after 12 months: " + localDate.plusMonths(12).getDayOfWeek());
    }

    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(2005, 5, 5);
        new Task_04().theDayOfTheWeek(birthday);
    }
}
