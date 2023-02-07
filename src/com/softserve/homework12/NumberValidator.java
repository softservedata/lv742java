package com.softserve.homework12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberValidator {

    private static int readNumber(int start, int end) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = 0;
        try {
            System.out.println("Enter your number");
            num = Integer.parseInt(reader.readLine());
        } catch (NumberFormatException | IOException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        if (num > start && num < end) {
            return num;
        }
        return 0;
    }

    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 100;
        for (int i = 0; i < 10; i++) {
            System.out.println(readNumber(num1, num2));
        }
    }
}
