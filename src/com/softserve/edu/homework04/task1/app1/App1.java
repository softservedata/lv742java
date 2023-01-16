package com.softserve.edu.homework04.task1.app1;

import java.util.Scanner;

public class App1 {

    private static float number1;
    private static float number2;
    private static float number3;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        inputData(scan);
        showResult(checkNumbersRange(number1, number2, number3));

    }

    private static boolean checkNumbersRange(float number1, float number2, float number3) {
        if (number1 >= -5 && number1 <= 5) {
            if (number2 >= -5 && number2 <= 5) {
                if (number3 >= -5 && number3 <= 5) {
                    return true;
                } else return false;
            } else return false;
        } else return false;
    }

    private static void inputData(Scanner scan) {
        System.out.print("Enter the first number: ");
        number1 = scan.nextFloat();
        System.out.print("Enter the second number: ");
        number2 = scan.nextFloat();
        System.out.print("Enter the third number: ");
        number3 = scan.nextFloat();
    }

    private static void showResult(boolean b) {
        if (b) {
            System.out.println("All numbers belong to the range [-5, 5]");
        } else System.out.println("Not all numbers belong to the range [-5, 5]");
    }

}

