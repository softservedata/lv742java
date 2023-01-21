package com.softserve.edu.homework05.array.models;

public class MinElementModel {
    public int getMinArr(int[] arr) {
        int minArr;
        int i = getMinArrPosition(arr);
        minArr = arr[i - 1];
        return minArr;
    }

    public int getMinArrPosition(int[] arr) {
        int minIndex = 0;
        int minArr = arr[minIndex];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minArr) {
                minIndex = i;
                minArr = arr[i];
            }
        }
        return minIndex + 1;
    }

    public final String getMessage() {
        return "The minimum is element in position ";
    }
}
