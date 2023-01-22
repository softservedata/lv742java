package com.softserve.edu05;

import java.util.Scanner;

public class AppCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Task 1 ------------------------------------------------

        System.out.print("Please enter number of month: ");
        System.out.println("There are " + Calculator.months(sc.nextInt()) + " in this month");

        // Task 2 ------------------------------------------------

        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++){
            System.out.print("Please enter numbers to array: ");
            nums[i] = sc.nextInt();
        }
        System.out.println("Your result = " + Calculator.countSumOrProd(nums));

        // Task 3 ------------------------------------------------

        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++){
            System.out.print("Please enter numbers to array: ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("Position of second positive number: " + Calculator.positionOfSecondPosNum(numbers));
        System.out.println("Min number: " + Calculator.minEll(numbers));
        System.out.println("Position of min number: " + Calculator.positionMinEll(numbers));
        System.out.println("Prod of all even numbers: " + Calculator.prodOfEvenNums(numbers));
    }
}
