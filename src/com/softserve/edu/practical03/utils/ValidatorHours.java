package com.softserve.edu.practical03.utils;

import java.util.Scanner;

public class ValidatorHours {

    public static double validateHours(Scanner scan) {
        double hours = scan.nextDouble();
        while (hours < 0) {
            System.out.print(Constants.HOURS_VLD_MSG);
            hours = scan.nextDouble();
        }
        return hours;
    }
}
