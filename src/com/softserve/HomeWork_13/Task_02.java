package com.softserve.HomeWork_13;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task_02 {
    public static boolean isValidDate(LocalDate date) {
        boolean isValid = false;
        try {
            date.format(DateTimeFormatter.ofPattern("MM.dd.yy"));
            isValid = true;
        } catch (DateTimeException e) {
            System.err.println("ERROR: " + e);
        } catch (Exception e) {
            System.err.println("ERROR: " + e);
        }
        return isValid;
    }

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(isValidDate(localDate));
    }
}
