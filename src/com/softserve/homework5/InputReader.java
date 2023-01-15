package com.softserve.homework5;

import java.util.Scanner;

public class InputReader {

    public static int readMonth() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of a month: ");
        return scanner.nextInt();
    }

//    public static int[] read10Integers() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Entering 10 integers...");
//        System.out.print("Enter your integer 1: ");
//        int i1 = scanner.nextInt();
//        System.out.print("Enter your integer 2: ");
//        int i2 = scanner.nextInt();
//        System.out.print("Enter your integer 3: ");
//        int i3 = scanner.nextInt();
//        System.out.print("Enter your integer 4: ");
//        int i4 = scanner.nextInt();
//        System.out.print("Enter your integer 5: ");
//        int i5 = scanner.nextInt();
//        System.out.print("Enter your integer 6: ");
//        int i6 = scanner.nextInt();
//        System.out.print("Enter your integer 7: ");
//        int i7 = scanner.nextInt();
//        System.out.print("Enter your integer 8: ");
//        int i8 = scanner.nextInt();
//        System.out.print("Enter your integer 9: ");
//        int i9 = scanner.nextInt();
//        System.out.print("Enter your integer 10: ");
//        int i10 = scanner.nextInt();
//        int[] arr = {i1, i2, i3, i4, i5, i6, i7, i8, i9, i10};
//        return arr;
//    }

    public static int[] read5Integers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your integer 1: ");
        int i1 = scanner.nextInt();
        System.out.print("Enter your integer 2: ");
        int i2 = scanner.nextInt();
        System.out.print("Enter your integer 3: ");
        int i3 = scanner.nextInt();
        System.out.print("Enter your integer 4: ");
        int i4 = scanner.nextInt();
        System.out.print("Enter your integer 5: ");
        int i5 = scanner.nextInt();
        int[] arr = {i1, i2, i3, i4, i5};
        return arr;
    }

    public static int[] read10Integers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entering 10 integers...");
        System.out.print("Enter your integer 1: ");
        int i1 = scanner.nextInt();
        System.out.print("Enter your integer 2: ");
        int i2 = scanner.nextInt();
        System.out.print("Enter your integer 3: ");
        int i3 = scanner.nextInt();
        System.out.print("Enter your integer 4: ");
        int i4 = scanner.nextInt();
        System.out.print("Enter your integer 5: ");
        int i5 = scanner.nextInt();
        System.out.print("Enter your integer 6: ");
        int i6 = scanner.nextInt();
        System.out.print("Enter your integer 7: ");
        int i7 = scanner.nextInt();
        System.out.print("Enter your integer 8: ");
        int i8 = scanner.nextInt();
        System.out.print("Enter your integer 9: ");
        int i9 = scanner.nextInt();
        System.out.print("Enter your integer 10: ");
        int i10 = scanner.nextInt();
        int[] arr = {i1, i2, i3, i4, i5, i6, i7, i8, i9, i10};
        return arr;
    }

    public static int readCarInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Request a car production year: ");
        int input = scanner.nextInt();
        return input;
    }
}
