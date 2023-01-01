package com.softserve.PracticalTask_01;

import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write a: ");
        double a = sc.nextInt();

        System.out.print("Write b: ");
        double b = sc.nextInt();

        System.out.println("Sum: " + (a + b));
        System.out.println("Difference: " + (a - b));
        System.out.println("Product: " + (a * b));
        System.out.println("Fraction: " + (a / b));
    }
}