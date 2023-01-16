package com.softserve.edu.homework04.task1.app3;

import java.util.Scanner;

public class ErrorApp {
    static HTTPError error;
    static String input;
    static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);
        input = readHttpError(scan);
        System.out.println(filterData(input));
    }

    private static String readHttpError(Scanner scan){
        System.out.print("Input HTTP status code: ");
        input = "ERROR"+ scan.next().trim();
        return input;
    }

    private static String filterData(String input){
        error = HTTPError.valueOf(input);
        return error.getErrorName();

    }
}
