package com.softserve.edu.hm11;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrUtil {
    public static String enterSentence() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String sentence = sc.nextLine();
        sc.close();
        return sentence;
    }

    public static List<String> parseString(String text) {
        String temp = "\\b(\\w+)\\b";
        Pattern p = Pattern.compile(temp);
        Matcher m = p.matcher(text);
        List<String> list = new ArrayList<>();
        while (m.find()) {
            list.add(m.group(1).trim());//text.substring(m.start(), m.end())
        }
        return list;
    }

    public static List<String> parseCurrency(String text) {
        String temp = "\\$[0-9]+\\.[0-9]{2}";
        Pattern p = Pattern.compile(temp);
        Matcher m = p.matcher(text);
        List<String> list = new ArrayList<>();
        while (m.find()) {
            list.add(text.substring(m.start(), m.end()));
        }
        return list;
    }

    public static void printTheLongestWord(List<String> list) {
        String max = Collections.max(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        System.out.println("max = " + max + ". size = " + max.length());
    }

    public static String reverseWord(List<String> list, int index) {
        StringBuilder str = new StringBuilder();
        for (int i = list.get(1).length() - 1; i >= 0; i--) {
            str.append(list.get(1).charAt(i));
        }
        return str.toString();
    }

    public static String listToString(List<String> list, String divider) {
        StringBuilder str = new StringBuilder();
        for (String el : list) {
            str.append(el);
            str.append(divider);
        }
        return str.toString();
    }
}
