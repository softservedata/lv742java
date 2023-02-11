package orest.edu11.print;

import orest.edu11.task1.LongestWord;
import orest.edu11.task2.StringRefactor;
import orest.edu11.task3.CurrencyFinder;

import java.util.Scanner;

public class Printer {
    public static void print() {
        try (Scanner scan = new Scanner(System.in)) {
            String[] words = {"hello", "world", "java", "programming", "language"};
//            String inputString = scan.nextLine();
//            String[] words = inputString.split(" ");

            String longestWord = LongestWord.longestWord(words);
            StringBuilder secondLongestWordInReverse = new StringBuilder(LongestWord.secondLongestWord(words));

            System.out.println("The longest word from sentence is: " + longestWord + "\n" +
                    "The length of the word is: " + longestWord.length());

            System.out.println();

            System.out.println("The second longest word from sentence in reverse is: "
                    + secondLongestWordInReverse.reverse() + "\n" +
                    "The length of the word is: " + secondLongestWordInReverse.length());

            System.out.println();

            String string = "   I       am      learning      Java       Core    ";
            System.out.println("Original string: " + string);
            System.out.println("Refactored string: " + StringRefactor.refactor(string));

            System.out.println();

            System.out.println("Enter the text that contains US currency: ");
            String input = scan.nextLine();
            CurrencyFinder.usCurrencyFinder(input);
        }
    }
}
