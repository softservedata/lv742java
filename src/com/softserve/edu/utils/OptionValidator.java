package com.softserve.edu.utils;

import com.softserve.edu.homework05.array.utils.Constants;

import java.util.Scanner;

public class OptionValidator {

    public static int validateOption(Scanner scan, int[] arrOption) {

        while (!scan.hasNextInt()) {
            String string = scan.nextLine().trim();
            System.out.printf("\"%s\" - not a number!%nTry again: ", string);
        }

        int caseOption = scan.nextInt();

        while (!contains(arrOption, caseOption)) {
            System.out.print("Unexpected value. Try again: ");
            while (!scan.hasNextInt()) {
                String string = scan.next().trim();
                System.out.printf("\"%s\" - not a number!%nTry again: ", string);
            }
            caseOption = scan.nextInt();
        }
        return caseOption;
    }

    public static boolean contains(final int[] arr, final int number) {
        boolean isInArray = false;
        for (int value : arr
        ) {
            if (value == number) {
                isInArray = true;
            }
        }
        return isInArray;
    }
}
