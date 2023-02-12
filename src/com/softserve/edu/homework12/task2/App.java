package com.softserve.edu.homework12.task2;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    static Scanner scanner = null;
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getArray()));
    }

    public static int readNumber(int start, int end) {
        try {
            scanner = new Scanner(System.in);
            System.out.print("Enter the number: ");
            int number = scanner.nextInt();

            if (number < start || number > end) throw new IndexOutOfBoundsException();
            else return number;

        } catch (IndexOutOfBoundsException e) {
            System.out.print("This number does not belong to the interval! \nTry again. ");
            return readNumber(start, end);

        } catch (InputMismatchException e) {
            System.out.print("This is not number! \nTry again. ");
            return readNumber(start, end);

        } catch (Exception e) {
            System.out.println("Error! \nTry again: ");
            return readNumber(start, end);

        }

    }
        public static int[] getArray () {
            try {
                int[] arr = new int[10];
                for (int i = 0; i < 10; i++) {
                    arr[i] = readNumber(1, 100);
                }
                return arr;
            } finally {
                if (scanner != null) {
                    scanner.close();
                }
            }
        }
    }
