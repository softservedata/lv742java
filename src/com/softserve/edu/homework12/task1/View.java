package com.softserve.edu.homework12.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class View {

    Calculator calculator;
    Scanner scanner = null;

    public View(Calculator calculator) {
        this.calculator = calculator;
    }

    public void doInput() {
        try {
            System.out.print("Enter the first value: ");
            double a = enterValue();

            System.out.print("Enter the second value: ");
            double b = enterValue();

            calculator.setA(a);
            calculator.setB(b);

        } catch (NullPointerException e) {
            e.getMessage();
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }

    public double enterValue() {
        scanner = new Scanner(System.in);
        try {
            return scanner.nextDouble();
        } catch (NumberFormatException | InputMismatchException e) {
            System.out.print("This not a number! \nTry again: ");
            return enterValue();
        }
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
