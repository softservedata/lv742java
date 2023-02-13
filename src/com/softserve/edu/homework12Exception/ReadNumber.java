package com.softserve.edu.homework12Exception;

import java.util.Scanner;
public class ReadNumber {
    public static int readNumber(int start, int end) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num <= start || num >= end) {
            throw new Exception("Invalid number. Diapazon must be 1-99");
        }
        return num;
    }

}

