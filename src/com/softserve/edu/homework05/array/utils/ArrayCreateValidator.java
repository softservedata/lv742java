package com.softserve.edu.homework05.array.utils;

import java.util.Scanner;

public class ArrayCreateValidator {
    public static int validateArrayElement(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            String string = scanner.next().trim();
            System.out.printf(Constants.NON_INT_MSG, string);
        }
        int value = scanner.nextInt();
        return value;
    }
}
