package com.softserve.edu.Homework11.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");

        String sentence = sc.nextLine();
        sc.close();

        WordManipulator wm = new WordManipulator(sentence);
        wm.findLongestWord();

        System.out.println("Longest word: " + wm.getLongestWord() + " with " + wm.getMaxLength() + " letters");
        System.out.println("Second word in reverse: " + wm.getSecondWordInReverse());
    }
}
