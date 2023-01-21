package com.softserve.edu.homework05.array.utils;

import java.util.Scanner;

public class NumberValidator {

    public static int validateNumber(Scanner scan, int[] arr) {
        while (!scan.hasNextInt()) {
            String string = scan.nextLine().trim();
            System.out.printf(Constants.NON_INT_MSG, string);
        }

        int number = scan.nextInt();

        while (!isInInterval(arr, number)) {
            System.out.print(Constants.NON_CASE_VALUE_MSG);
            while (!scan.hasNextInt()) {
                String string = scan.next().trim();
                System.out.printf(Constants.NON_INT_MSG, string);
            }
            number = scan.nextInt();
        }
        return number;
    }

    public static boolean isInInterval(final int[] arr, final int number) {
        if (0 <= number && number <= arr.length) {
            return true;
        }
        return false;
    }
}
