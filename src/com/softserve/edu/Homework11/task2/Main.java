package com.softserve.edu.Homework11.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scan.nextLine();
        scan.close();

        SentenceCleaner cleaner = new SentenceCleaner(sentence);
        System.out.println("Cleaned sentence: " + cleaner.clean());

    }
}
