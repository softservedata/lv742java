package com.softserve.edu.homework12.practicaltask.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class View {

    Rectangle rectangle;

    Scanner scanner;


    public void doInput() {
        scanner = new Scanner(System.in);

        try {
            System.out.println("Enter the length: ");
            rectangle.setA(scanner.nextDouble());
        } catch (InputMismatchException e) {
            e.getMessage();
        }
        try {
            System.out.println("Enter the width: ");
            rectangle.setB(scanner.nextDouble());
        } catch (InputMismatchException e) {
            e.getMessage();
        }
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
