package com.softserve.edu.homework07.views;

import com.softserve.edu.utils.OptionValidator;

import java.util.Scanner;

public class AppView {
    Scanner scan;

    public int chooseOption1() {
        int[] option = {0, 1, 2, 3};
        scan = new Scanner(System.in);
        System.out.print("""
                --------------------------------------
                Select an option and enter its number:
                            
                1. Create salaried employee
                2. Create contract employee 
                3. Finish creation and display information
                0. Close app
                --------------------------------------
                """);
        return OptionValidator.validateOption(scan, option);
    }

    public int chooseOption2() {
        int[] option = {1, 2, 0};
        scan = new Scanner(System.in);
        System.out.print("""
                --------------------------------------------------------
                Сhoose how to display the information:
                            
                1. Arrange the entire sequence of employees by last name 
                in alphabetical order
                2. Arrange the entire sequence of workers descending the 
                average monthly wage.
                0. Close app
                ---------------------------------------------------------
                """);

        return OptionValidator.validateOption(scan, option);
    }

    public void closeApp() {
        System.out.println("App closed!");
        scan.close();
        System.exit(0);
    }

    public void getOutput(String output) {
        System.out.print(output);
    }

    public void getOutput(Object object) {
        System.out.println(object);
    }
}

