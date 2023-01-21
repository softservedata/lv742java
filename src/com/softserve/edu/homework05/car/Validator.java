package com.softserve.edu.homework05.car;

import java.util.Scanner;

public class Validator {

    public static int validateNumber(Scanner scan){
        while (!scan.hasNextInt()){
            String str = scan.next().trim();
            System.out.printf("\"%s\" - not a number!%nTry again: ", str);
        }
        int number = scan.nextInt();
        return number;
    }

    public static String validateType(Scanner scan){
        String type = scan.next().trim();
        while (type.isEmpty()){
            System.out.println("Type is empty! Try again: ");
            type = scan.next();
        }

        return type;
    }

}
