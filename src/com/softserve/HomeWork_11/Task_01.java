package com.softserve.HomeWork_11;

import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();

        String longestWord = "";
        for (int i = 0; i < sentence.split("[\\W]").length; i++) {
            if (sentence.split("[\\W]")[i].length() > longestWord.length()) {
                longestWord = sentence.split("[\\W]")[i];
            }
        }

        System.out.println("The longest word: " + longestWord);
        System.out.println("The number of the longest word letters: " + longestWord.length());
        StringBuilder b = new StringBuilder(sentence.split("[\\W]")[1]);
        System.out.println("The second word in reverse order: " + b.reverse());
    }
}
