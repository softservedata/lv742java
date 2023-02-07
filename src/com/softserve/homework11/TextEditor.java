package com.softserve.homework11;

import java.util.Scanner;


public class TextEditor {

    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        editor.extractAndProcessWords();
    }

    public void extractAndProcessWords() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your sentence of five words");
        String message = scanner.nextLine();
        String[] s = message.split(" ");
        if (s.length != 5) {
            System.out.println("Not valid number of letters. A sentence should have 5 words");
        }
        if (s.length == 5) {
            int maxLength = s[0].length();
            String longestWord = "";
            String secondWord = s[1];
            for (String value : s) {
                if (value.length() > maxLength) {
                    longestWord = value;
                }

            }
            System.out.println(" The longest word is " + longestWord
                    + ", the number of letters: " + longestWord.length());
            System.out.println("The second word is " + secondWord);
            StringBuilder sbSecondWord = new StringBuilder(secondWord);
            System.out.println("The reverse order of word " + secondWord + " is " + sbSecondWord.reverse());

        }
    }

}
