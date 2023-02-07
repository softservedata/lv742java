package com.softserve.HomeWork_11;

import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        System.out.println(sentence.replaceAll("[ ]+", " "));
    }
}
