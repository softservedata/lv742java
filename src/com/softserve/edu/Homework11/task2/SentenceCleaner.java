package com.softserve.edu.Homework11.task2;

class SentenceCleaner {
    private String sentence;

    public SentenceCleaner(String sentence) {
        this.sentence = sentence;
    }

    public String clean() {
        return sentence.trim().replaceAll("\\s+", " ");
    }
}

