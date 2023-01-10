package com.softserve.homework4;

import java.util.Scanner;

public class ConditionStatement {

    public static void isWithinRange() {
        System.out.println("To check if numbers match the range....");
        String[] srtArray = readThreeNumbers();
        Float[] numbers = convertToFloatArray(srtArray);
        for (Float number : numbers) {
            boolean isWithinRange;
            if(number >= -5f && number <=5f) {
                isWithinRange = true;
            } else {
                isWithinRange = false;
            }
            System.out.println(number + "\tisWithinRange " + isWithinRange );
        }
    }

    public static void findMixAndMinValue() {
        System.out.println("To find the min and mix value....");
        String[] strArray = readThreeNumbers();
        int[] numbers = convertToIntArray(strArray);
        int minValue = numbers[0];
        int maxValue = numbers[0];
        for (int number : numbers) {
            if (number < minValue) {
                minValue = number;
            }
            if (number > maxValue) {
                maxValue = number;
            }
        }
        System.out.println("the max value is " + maxValue + "\tthe min value is " + minValue);
    }

    public static void getHTTPErrorName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter HTTP Error number");
        String string = scanner.nextLine();
        int number = Integer.parseInt(string);
        for (HTTPError value : HTTPError.values()) {
            if(number == (value.getStatusCode())) {
                System.out.println("A name for HTTP Error " + string + " is " + value.getName());
                return;
              }
            }
        throw new RuntimeException("The code " + string + " doesn't exist");
        }

    private static String[] readThreeNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first number");
        String n1 = scanner.nextLine();
        System.out.println("Enter your second number");
        String n2 = scanner.nextLine();
        System.out.println("Enter your third number");
        String n3 = scanner.nextLine();
        String[] strArray = {n1, n2, n3};
        return strArray;
    }

    private static int[] convertToIntArray(String[] strArray) {
        int[] values = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            values[i] = Integer.parseInt(strArray[i]);
        }
        return values;
    }

    private static Float[] convertToFloatArray(String[] strArray) {
        Float[] values = new Float[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            values[i] = Float.parseFloat(strArray[i]);
        }
        return values;
    }


}
