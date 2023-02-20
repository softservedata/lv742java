package com.softserve.edu.homework13.datatime;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.stream.Stream;

public class DataApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the date in the format mm.dd.yy: ");
        String s = scanner.nextLine();
        if (DataService.isValidDateFormat(s)) {
            System.out.println("This date matches the format mm.dd.yy");
        } else System.out.println("This date does not match the format mm.dd.yy");

        System.out.println("Is it a leap year?");
        System.out.println("1998 - " + DataService.isLeapYear(1998));
        System.out.println("2004 - " + DataService.isLeapYear(2004));

        LocalDate birthday = LocalDate.of(2001, 07, 31);
        DataService.printDayOfWeek(birthday);
        scanner.close();
    }
}
