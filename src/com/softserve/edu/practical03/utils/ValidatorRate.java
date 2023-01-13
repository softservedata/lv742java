package com.softserve.edu.practical03.utils;


import java.util.Scanner;

public class ValidatorRate {
    public static double validateRate(Scanner scan) {

            double rate = scan.nextDouble();
            while (rate <= 0 ) {
                System.out.print(Constants.RATE_VLD_MSG);
                rate = scan.nextDouble();
            }

            return rate;

    }
}
