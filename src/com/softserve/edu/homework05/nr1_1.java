package com.softserve.edu.homework05;
import java.util.Scanner;

public class nr1_1 {
            public static void main(String[] args) {
            int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            Scanner scanner = new Scanner(System.in);

            System.out.print("Please enter the number of the month: ");
            int month = scanner.nextInt();

            //validate the user input
            if (month < 1 || month > 12) {
                System.out.println("Invalid month number. Please enter a number between 1 and 12.");
            } else {
                int days = daysInMonth[month - 1];
                System.out.println("Number of days in month " + month + " is " + days);
            }
        }

}
