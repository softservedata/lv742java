package com.softserve.homework5;

public class Calculator {

    public int matchMonthDays(int input) {
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return monthDays[input - 1];
    }

    public int getSumOrProduct(int[] nums) {
        int sum = 0;
        int positiveCount = 0;
        int product = 1;
        for (int i = 0; i < nums.length / 2; i++) {
            if (nums[i] > 0) {
                positiveCount++;
            }
        }
        for (int i = 0; i < nums.length / 2; i++) {
            if (positiveCount == 5) {
                sum = sum + nums[i];
            }
        }
        for (int j = 5; j < nums.length; j++) {
            if (positiveCount != 5) {
                product = product * nums[j];
            }
        }
        if (positiveCount == 5) {
            return sum;
        } else {
            return product;
        }
    }

    public int getPositiveNumPosition(int[] nums) {
        int positiveNum = 0;
        int i = 0;
        while (i < nums.length) {
            if (nums[i] > 0) {
                positiveNum++;
            }
            if (positiveNum == 2) {
                return i + 1;
            }
            i++;
        }
        throw new RuntimeException("Not enough positive numbers in the array");
    }


    public int getMinNum(int[] nums) {
        int min = nums[0];
        int i = 0;
        while (i < nums.length) {
            if (nums[i] < min) {
                min = nums[i];
            }
            i++;
        }
        return min;
    }

    public int getEvenNumsProduct(int[] nums) {
        int product = 1;
        for (int num : nums) {
            if (num % 2 == 0) {
                product = product * num;
            }
        }
        if (product != 1) {
            return product;
        } else {
            throw new RuntimeException("No even numbers found");
        }
    }

}
