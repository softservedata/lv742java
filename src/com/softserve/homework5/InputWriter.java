package com.softserve.homework5;

public class InputWriter {
    public static void writeSumOrProduct(int sum, int product) {
        if (sum != 0) {
            System.out.println("The sum is " + sum);
        } else {
            System.out.println("The product is " + product);
        }
    }

    public static void writeMonthDays(int monthDay) {
        System.out.println(monthDay);
    }

    public static void writeSecondPositiveNumberPosition(int position) {
        System.out.println("The position of the second positive number is " + position);
    }

    public static void writeMinNumWithPosition(int min, int index) {
        System.out.print("The min number is " + min);
        System.out.println(", the position in array is " + (index + 1));
    }

    public static void writeEvenNumsProduct(int product) {
        System.out.println("The product of even numbers is " + product);
    }




}
