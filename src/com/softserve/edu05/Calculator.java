package com.softserve.edu05;

public class Calculator {
    public static int months(int monthPos){
        int[] monthsDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return monthsDays[monthPos - 1];
    }

    public static int countSumOrProd(int[] nums){
        int count = 0, res = 0;
        for (int i = 0; i < nums.length; i++){
            if(i < 5 && nums[i] > 0){
                count++;
            }
        }
        if (count == 5){
            res = nums[0] + nums[1] + nums[2] + nums[3] + nums[4];
        } else {
            res = nums[5] * nums[6] * nums[7] * nums[8] * nums[9];
        }
        return res;
    }

    public static int positionOfSecondPosNum(int[] nums){
        int count = 0, secondPosNum = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] > 0){
                if(count == 1){
                    secondPosNum = i + 1;
                }
                count++;
            }
        }
        return secondPosNum;
    }

    public static int minEll(int[] nums){
        int min = nums[0];
        for (int i = 0; i < nums.length; i++){
            if (nums[i] < min){
                min = nums[i];
            }
        }
        return min;
    }

    public static int positionMinEll(int[] nums){
        int pos = 0, min = nums[0];
        for (int i = 0; i < nums.length; i++){
            if (nums[i] < min){
                min = nums[i];
                pos = i + 1;
            }
        }
        return pos;
    }

    public static int prodOfEvenNums(int[] nums){
        int prodEvenNum = 1;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] % 2 == 0){
                prodEvenNum *= nums[i];
            }
        }
        return prodEvenNum;
    }
}
