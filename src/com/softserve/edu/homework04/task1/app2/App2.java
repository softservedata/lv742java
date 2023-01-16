package com.softserve.edu.homework04.task1.app2;

import java.util.Scanner;

public class App2 {

    private static int number1;
    private static int number2;
    private static int number3;
    static int min;
    static int max;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        inputData(scan);
        getMaxValue(number1, number2, number3);
        getMinValue(number1, number2, number3);
        showResult();
    }

    static int getMaxValue(int number1, int number2, int number3) {
        if (number1 >= number2 && number1 >= number3) {
            max = number1;
        } else if (number2 >= number1 && number2 >= number3) {
            max = number2;
        } else max = number3;

        return max;
    }

    static int getMinValue(int number1, int number2, int number3) {
        if (number1 <= number2 && number1 <= number3) {
            min = number1;
        } else if (number2 <= number1 && number2 <= number3) {
            min = number2;
        } else min = number3;
        return min;
    }

    private static void inputData(Scanner scan) {
        System.out.print("Enter the first number: ");
        number1 = scan.nextInt();
        System.out.print("Enter the second number: ");
        number2 = scan.nextInt();
        System.out.print("Enter the third number: ");
        number3 = scan.nextInt();
    }

    private static void showResult() {
        System.out.println("Min value is " + min);
        System.out.println("Max value is " + max);
    }
}
