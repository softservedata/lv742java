package com.softserve.edu11.part1;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String theLongestWord;
        List<String> strList = new LinkedList<>();
        String pattern = "\\b[a-zA-Z']+\\b";
        String text;
        text = sc.nextLine();
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        System.out.println();
        while (m.find()) {
            strList.add(text.substring(m.start(), m.end()));
        }
        //=========================================================================================

        theLongestWord = strList.get(0);

        for (String current: strList) {
            if (current.length() > theLongestWord.length()){
                theLongestWord = current;
            }
        }

        System.out.println("The longest word is: " + "\"" + theLongestWord + "\"" + " It has: " +
                theLongestWord.length() + " letters");

        //=========================================================================================

        StringBuilder sb = new StringBuilder(strList.get(1));
        sb.reverse();
        System.out.println("Reverse second word: " + sb);

    }
}
