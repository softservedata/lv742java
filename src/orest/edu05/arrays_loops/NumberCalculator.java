package orest.edu05.arrays_loops;

import java.util.Scanner;

public class NumberCalculator {

    public void dayAndMonthCalculate() {
        Scanner scanner = new Scanner(System.in);

        int[] daysOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.print("Enter the number of month: ");

        int month = scanner.nextInt();

        switch (month) {
            case 1:
                System.out.println("First month of the year January has " + daysOfMonth[0] + " days.");
                break;
            case 2:
                System.out.println("Second month of the year February has " + daysOfMonth[1] + " days.");
                break;
            case 3:
                System.out.println("Third month of the year March has " + daysOfMonth[2] + " days.");
                break;
            case 4:
                System.out.println("Fourth month of the year April has " + daysOfMonth[3] + " days.");
                break;
            case 5:
                System.out.println("Fifth month of the year May has " + daysOfMonth[4] + " days.");
                break;
            case 6:
                System.out.println("Sixth month of the year June has " + daysOfMonth[5] + " days.");
                break;
            case 7:
                System.out.println("Seventh month of the year July has " + daysOfMonth[6] + " days.");
                break;
            case 8:
                System.out.println("Eighth month of the year August has " + daysOfMonth[7] + " days.");
                break;
            case 9:
                System.out.println("Ninth month of the year September has " + daysOfMonth[8] + " days.");
                break;
            case 10:
                System.out.println("Tenth month of the year October has " + daysOfMonth[9] + " days.");
                break;
            case 11:
                System.out.println("Eleventh month of the year November has " + daysOfMonth[10] + " days.");
                break;
            case 12:
                System.out.println("Twelfth month of the year December has " + daysOfMonth[11] + " days.");
                break;

            default:
                System.out.println("Month " + month + " does not exists.");
        }
    }

    public void sumOrProduct() {
        int[] array = {1, 2, -2, 4, 5, 1, 2, 2, 2, 2};

        int sum = 0;

        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] < 0) {
                sum = -1;
                break;
            } else {
                sum += array[i];
            }
        }

        int product = 1;

        if (sum > 0) {
            System.out.println("The sum of first five elements of array is: " + sum);
        } else {
            for (int i = array.length / 2; i <= array.length - 1; i++) {
                product *= array[i];
            }
            System.out.println("The product of last five elements of array is: " + product);
        }
    }

    public void secondPositiveAndMinimum() {
        int[] array = {-4, 3, 8, -8, 5};

        int counter = 0;
        int secondPositive = -1;
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                counter++;
            }
            if (counter == 2) {
                secondPositive = array[i];
                index = i;
                break;
            }
        }

        int min = array[0];
        int indexForMin = 0;
        int product = 1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                product *= array[i];
            }
            if (array[i] < min) {
                min = array[i];
                indexForMin = i;
            }
        }

        if (secondPositive == -1) {
            System.out.println("There are no positive numbers in the array.");
        } else {
            System.out.println("The second positive number is " + secondPositive + " has index " + index + ".");
        }

        System.out.println("The minimum value of the array is " + min + " has index " + indexForMin + ".");
        System.out.println("The product of the array elements is: " + product);
    }
}
