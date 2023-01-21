package com.softserve.edu.homework05.array.models;

public class PositionPositiveModel {
    public int getPositionPositiveNumb(int[] arr, int number) {
        int index = -1;
        int posCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                posCount++;
            }
            if (posCount == number) {
                index = i;
                break;
            }
        }
        return index + 1;
    }

    public final String getMessage() {
        return "This positive number is in position ";
    }
}
