package com.softserve.edu.homework11.task2;

public class SentenceService {

    public String convertSentence(String str) {

        return str.replaceAll("\s+", " ");

    }
}