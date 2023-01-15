package com.softserve.edu.hm5;

import java.util.Scanner;

public class IOArray {
    private static Scanner sc = new Scanner(System.in);

    public static void fillIntArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Input element[" + (i + 1) + "]: ");
            arr[i] = Integer.parseInt(sc.nextLine());
        }
    }

    public static void outPutArray(Object[] arr) {
        for (Object el : arr) {
            System.out.println(el);
        }
    }
}