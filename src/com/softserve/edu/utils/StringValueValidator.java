package com.softserve.edu.utils;

import java.util.Scanner;

public class StringValueValidator {
    public static String validateValue(Scanner scan){
        String value = scan.next().trim();
        while (value.isEmpty()){
            System.out.println("Value is empty! Try again: ");
            value = scan.next();
        }
        return value;
    }
}
