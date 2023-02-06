package com.softserve.edu.homework11.task1;

public class SentenceService {
    public String displayLongest(String s) {
        String longestWord;
        String[] arr = s.split(" ");
        longestWord = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > longestWord.length()) {
                longestWord = arr[i];
            }
        }
        return longestWord;
    }

    public String reverseSecondWord(String s) {
        String[] arr = s.split(" ");
        try {
            StringBuilder stringBuilder = new StringBuilder(arr[1]);
            return stringBuilder.reverse().toString();

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The sentence not contain a second word");
            return "";
        }
    }

    public int findNumberOfLetters(String s) {
        String[] arr = s.split(" ");
        int sum = 0;
        for (String current : arr
        ) {
            sum += current.length();
        }
        return sum;
    }

}
