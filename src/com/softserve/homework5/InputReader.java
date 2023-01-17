package com.softserve.homework5;

import java.util.Arrays;
import java.util.Scanner;

public class InputReader {
    private static Scanner scanner = new Scanner(System.in);
    public static int readMonth() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of a month: ");
        return scanner.nextInt();
    }

    public static int[] read5Integers() {
        String request = "Enter your integer: ";
        System.out.print(request);
        int i1 = scanner.nextInt();
        System.out.print(request);
        int i2 = scanner.nextInt();
        System.out.print(request);
        int i3 = scanner.nextInt();
        System.out.print(request);
        int i4 = scanner.nextInt();
        System.out.print(request);
        int i5 = scanner.nextInt();
        return new int[]{i1, i2, i3, i4, i5};
    }

    public static int[] read10Integers() {
        String request = "Enter your integer: ";
        System.out.print(request);
        int i6 = scanner.nextInt();
        System.out.print(request);
        int i7 = scanner.nextInt();
        System.out.print(request);
        int i8 = scanner.nextInt();
        System.out.print(request);
        int i9 = scanner.nextInt();
        System.out.print(request);
        int i10 = scanner.nextInt();
        int[] firstArr = {i6, i7, i8, i9, i10};
        int[] secondArr = read5Integers();
        int firsArrLength = firstArr.length;
        int secondArrLength = secondArr.length;
        int[] result = new int[firsArrLength + secondArrLength];
        System.arraycopy(firstArr, 0, result, 0, firsArrLength);
        System.arraycopy(secondArr, 0, result, firsArrLength, secondArrLength);
        return result;
    }

    public static int readCarInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Request a car production year: ");
        int input = scanner.nextInt();
        return input;
    }
}
