package com.softserve.edu.homework05.array.views;

import com.softserve.edu.homework05.array.utils.ArrayCreateValidator;
import com.softserve.edu.homework05.array.utils.NumberValidator;
import com.softserve.edu.homework05.array.utils.Validator;

import java.util.Scanner;

public class View {
    Scanner scan;

    public int chooseFirstOption() {
        int[] options1 = {1, 2, 0};
        scan = new Scanner(System.in);
        System.out.print("""
                --------------------------------------
                Select an action and enter its number:
                            
                1. Find out how many days in a month
                2. Enter numbers and act on them 
                0. Close app
                --------------------------------------
                """);
        return Validator.validateOption(scan, options1);
    }

    public int chooseSecondOption() {
        int[] options2 = {1, 2, 3, 4, 0};
        scan = new Scanner(System.in);
        System.out.print("""
                ----------------------------------------------------------------
                Select an action over numbers and enter its number:
                            
                1. Calculate the sum of first n elements if they are positive or
                   product of last element in the other case
                2. Find position of the nth positive number
                3. Find position of minimum
                4. Count the product of all even numbers
                0. Close app
                -----------------------------------------------------------------
                """);
        return Validator.validateOption(scan, options2);
    }

    public int[] createArr() {
        scan = new Scanner(System.in);
        System.out.print("Enter the quantity of numbers: ");
        int length = ArrayCreateValidator.validateArrayElement(scan);
        int[] arr = new int[length];
        System.out.println("Enter the numbers: ");
        for (int i = 0; i < length; i++) {
            arr[i] = ArrayCreateValidator.validateArrayElement(scan);
        }
        return arr;
    }

    public void getOutput(String output) {
        System.out.println(output);
    }


    public class MonthDaysView {

        public int inputDay() {
            int[] month = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
            scan = new Scanner(System.in);
            System.out.println("""
                    Select a month and enter its number:
                    1.	January
                    2.	February
                    3.	March
                    4.	April
                    5.	May
                    6.	June
                    7.	July
                    8.	August
                    9.	September
                    10.	October
                    11.	November
                    12.	December
                    """);
            return Validator.validateOption(scan, month);
        }

        public void getOutput(String output) {
            System.out.println(output);
        }

    }

    public class PositionPositiveView {
        public int[] inputArr() {
            int[] arr = createArr();
            return arr;
        }

        public int inputNumber(int[] arr) {
            scan = new Scanner(System.in);
            System.out.println("Enter the position number of the positive element to be found ");
            int number = NumberValidator.validateNumber(scan, arr);
            return number;
        }

        public void getOutput(String output) {
            System.out.println(output);
        }
    }

    public class SumOrProdView {
        public int[] inputArr() {
            int[] arr = createArr();
            return arr;
        }

        public int inputNumber(int[] arr) {
            scan = new Scanner(System.in);
            System.out.println("Enter the number of first elements to check for positivity ");
            int number = NumberValidator.validateNumber(scan, arr);
            return number;
        }

        public void getOutput(String output) {
            System.out.println(output);
        }
    }

    public void closeApp() {
        System.out.println("App closed!");
        scan.close();
        System.exit(0);
    }
}
