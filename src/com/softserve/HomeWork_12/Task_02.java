package com.softserve.HomeWork_12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_02 {
    public static int readNumber(int start, int end) {
        int number = -1;
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the number: ");
            number = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("The input data is incorrect. Try again.");
            return -1;
        } catch (Error e) {
            System.err.println("ERROR: " + e);
            return -1;
        }

        if (number > start && number < end) {
            System.out.print("The number is: ");
            return number;
        } else {
            System.out.print("The number doesn`t belong to this range. Exit code: ");
            return 0;
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(Task_02.readNumber(1, 100));
        }
    }
}
