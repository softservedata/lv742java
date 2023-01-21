package com.softserve.edu.homework05.array.models;

public class SumOrProdModel {


    public int getArraySum(int[] arr, int startInd, int finalInd) {
        int sumArr = 0;
        for (int i = startInd; i < finalInd; i++) {
            sumArr += arr[i];
        }

        return sumArr;
    }

    public int getArrayProd(int[] arr, int startInd, int finalInd) {
        int prodArr = 1;
        for (int i = startInd; i < finalInd; i++) {
            prodArr *= arr[i];

        }

        return prodArr;
    }

    public int getSumOrProd(int[] arr, int number) {
        boolean isPositive = true;
        for (int i = 0; i < number; i++) {
            if (arr[i] < 0) {
                isPositive = false;
                break;
            }
        }
        if (isPositive) {
            return getArraySum(arr, 0, number);
        } else return getArrayProd(arr, number, arr.length);

    }

    public final String getMessage() {
        return "Result is ";
    }
}
