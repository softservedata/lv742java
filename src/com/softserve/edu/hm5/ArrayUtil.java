package com.softserve.edu.hm5;

public class ArrayUtil {
    //pointWhenStop - from first
    public static int addFirstNumberOfIntArray(int[] arr, int pointWhenStop) {
        if (pointWhenStop > arr.length || pointWhenStop <= 0) return -1;
        int sum = 0;
        for (int i = 0; i < pointWhenStop; i++) {
            sum += arr[i];
        }
        return sum;
    }

    //pointWhenStop - from last
    public static int productLastNumberOfIntArray(int[] arr, int pointWhenStop) {
        if (pointWhenStop > arr.length || pointWhenStop <= 0) return -1;
        int product = 1;
        for (int i = arr.length - 1; i >= pointWhenStop; i--) {
            product *= arr[i];
        }
        return product;
    }

    //pointWhenStop - from fist
    public static boolean firstElementArePositive(int[] arr, int pointWhenStop) {
        boolean firstElPositive = true;
        for (int i = 0; i < pointWhenStop; i++) {
            if (arr[i] < 0) {
                firstElPositive = false;
                break;
            }
        }
        return firstElPositive;
    }

    public static int positionOfPositiveNumber(int[] arr, int number) {
        int counterPositiveNumber = 0;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                counterPositiveNumber++;
                if (counterPositiveNumber == number) return ++i;
            }
        }
        return index;
    }

    public static int min(int arr[]) {
        int min = arr[0];
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }
        return index == -1 ? -1 : ++index;
    }

    public static int productOfEvenNumber(int arr[]) {
        int product = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                product *= arr[i];
            }
        }
        return product;
    }
}
