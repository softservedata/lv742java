package com.softserve.edu13.part2;


import java.time.LocalDate;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the date in the format 'mm.dd.yy' : ");

        if(DateTimeCheck.isValidDate(sc.nextLine())){
            System.out.println("Valid Date");
        } else {
            System.out.println("Invalid date");
        }

        System.out.println("Please enter year: ");
        int year = sc.nextInt();
        if (DateTimeCheck.isLeap(year)){
            System.out.println("Year " + year + " is Leap");
        } else {
            System.out.println("Year " + year + " isn't Leap");
        }

        LocalDate myBirthday = LocalDate.of(2005, 4, 2);
        DateTimeCheck.dayOfTheWeek(myBirthday);
    }
}
