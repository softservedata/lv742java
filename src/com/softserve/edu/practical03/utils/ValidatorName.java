package com.softserve.edu.practical03.utils;

import java.util.Scanner;

public class ValidatorName {
    public static String validateName(Scanner scan) {
        String name = scan.next().trim();
        while (name.isEmpty()) {
            System.out.print(Constants.NAME_VLD_MSG);
            name = scan.nextLine().trim();
        }
        return name;
    }
}
