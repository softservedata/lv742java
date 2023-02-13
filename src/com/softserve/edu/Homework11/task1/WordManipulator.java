package com.softserve.edu.Homework11.task1;

class WordManipulator {
    private String sentence;
    private int maxLength;
    private String secondWord;
    private String longestWord;

    public WordManipulator(String sentence) {

        this.sentence = sentence;
    }
    public void findLongestWord() {
        String[] words = sentence.split(" ");
        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
                longestWord = word;
            }
            if (words[1].length() == word.length()) {
                secondWord = new StringBuilder(words[1]).reverse().toString();
            }
        }
    }
    public String getLongestWord() {
        return longestWord;
    }

    public int getMaxLength() {
        return maxLength;
    }

    public String getSecondWordInReverse() {
        return secondWord;
    }
}