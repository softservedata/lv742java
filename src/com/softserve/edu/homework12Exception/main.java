package com.softserve.edu.homework12Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws InputMismatchException {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter first number: ");
            double a = scan.nextDouble();
            System.out.print("Enter second number: ");
            double b = scan.nextDouble();
            CalcDiv _div = new CalcDiv(a, b);
            System.out.println("Result: " + _div.div());
        }  catch (InputMismatchException e) {
            System.out.println("Invalid input");
        }
        catch (Exception e) {
            System.out.println("Error: division by zero.");

        }
        System.out.println("\nTASK2\n");
        System.out.println("Enter 10 numbers between 1 and 100, each subsequent number \nmust be greater than the previous one, otherwise an error:\n ");
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            try {
                System.out.print("Enter number " + (i+1) + ": ");
                int number = ReadNumber.readNumber(1, 100);
                if (i > 0 && number <= numbers[i - 1]) {
                    throw new Exception("Number is not greater than previous number");

                }
                numbers[i] = number;
                System.out.println("Number " + (i + 1) + ": " + number);
            }  catch (InputMismatchException e) {
                System.out.println("Invalid input");
                i--;
            }
            catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                i--;
            }
        }



    }
}
