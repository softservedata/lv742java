package com.softserve.homework5;

import java.util.Arrays;

public class InputWriter {

    private final Calculator calculator = new Calculator();

    public void writeMatchMonthDays() {
        int input = InputReader.readMonth();
        int monthDays = calculator.matchMonthDays(input);
        System.out.println("The month number " + input + " has " + monthDays + " days");
    }

    public void write3calculations() {
        System.out.println("Enter 5 integers...");
        int[] nums = InputReader.read5Integers();
        writePositiveNumPosition(nums);
        writeMinNum(nums);
        writeEvenNumsProduct(nums);
    }

    public void writeSumOrProduct() {
        System.out.println("Enter 10 integers...");
        int[] nums = InputReader.read10Integers();
        int result = calculator.getSumOrProduct(nums);
        System.out.println("The result is " + result);
    }

    private void writePositiveNumPosition(int[] nums ) {
        int positiveNumPosition = calculator.getPositiveNumPosition(nums);
        System.out.println("The position of the second positive number is " + positiveNumPosition);
    }

    private void writeMinNum(int[] nums ) {
        int minNum = calculator.getMinNum(nums);
        int minNumIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if(minNum == nums[i]) {
                minNumIndex = i;
            }
        }
        System.out.println("The min num is " + minNum + " in position " + (minNumIndex + 1));

    }

    private void writeEvenNumsProduct(int[] nums ) {
        int product = calculator.getEvenNumsProduct(nums);
        System.out.println("The product of all even numbers is " +  product);
    }



}
