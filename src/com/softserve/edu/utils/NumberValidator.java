package com.softserve.edu.utils;

import java.util.Scanner;

public class NumberValidator {
    public static int validateIntNumber(Scanner scan){
        while (!scan.hasNextInt()){
            String str = scan.next().trim();
            System.out.printf("\"%s\" - not a number!%nTry again: ", str);
        }
        int number = scan.nextInt();
        return number;
    }

    public static int validateIntPositiveNumber(Scanner scan){

        while (!scan.hasNextInt()){
            String str = scan.next().trim();
            System.out.printf("\"%s\" - not a number!%nTry again: ", str);
        }
        int number = scan.nextInt();

        while (number<0){
            System.out.printf("Number is negative!%nTry again: ");
            while (!scan.hasNextInt()){
                String str = scan.next().trim();
                System.out.printf("\"%s\" - not a number!%nTry again: ", str);
            }
            number = scan.nextInt();
        }
        return number;
    }

    public static double validateDoubleNumber(Scanner scan){
        while (!scan.hasNextDouble()){
            String str = scan.next().trim();
            System.out.printf("\"%s\" - not a number!%nTry again: ", str);
        }
        double number = scan.nextDouble();
        return number;
    }


}
