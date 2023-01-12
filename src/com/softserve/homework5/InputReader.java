package com.softserve.homework5;

import java.util.Scanner;

public class InputReader {

    public static int readMonth() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of a month: ");
        return scanner.nextInt();
    }
}
