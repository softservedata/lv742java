package com.softserve.HomeWork_12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_01 {
    public static double div(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a: ");
            double a = scanner.nextDouble();
            System.out.println("Enter b: ");
            double b = scanner.nextDouble();
            System.out.println("a/b = " + div(a, b));
        } catch (InputMismatchException e) {
            System.err.println("The input data is incorrect. Try again.");
        } catch (Exception e) {
            System.err.println("ERROR: " + e);
        }


    }
}
