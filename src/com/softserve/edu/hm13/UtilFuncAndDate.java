package com.softserve.edu.hm13;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class UtilFuncAndDate {
    public static final char MAX_IN_LOWER_CASE = 'z';
    public static final char MAX_IN_UPPER_CASE = 'Z';
    public static final char MIN_IN_LOWER_CASE = 'a';
    public static final char MIN_IN_UPPER_CASE = 'A';

    public static List<String> parseString(String text) {
        String temp = "\\b([A-Za-z]+)\\b";
        Pattern p = Pattern.compile(temp);
        Matcher m = p.matcher(text);
        List<String> list = new ArrayList<>();
        while (m.find()) {
            list.add(m.group(1).trim());//text.substring(m.start(), m.end())
        }
        return list;
    }

    public static boolean isUpperCase(char ch) {
        if (ch >= MIN_IN_UPPER_CASE && ch <= MAX_IN_UPPER_CASE) return true;
        else return false;
    }

    public static String moveChars(String s, int n) {
        if ((n > (MAX_IN_UPPER_CASE - MIN_IN_UPPER_CASE)) || n == 0) return "";

        StringBuilder str = new StringBuilder(s);
        char tempChar = 0;
        for (int i = 0; i < str.length(); i++) {
            tempChar = str.charAt(i);
            if (n > 0) {
                if (isUpperCase(tempChar)) {
                    if (tempChar + n > MAX_IN_UPPER_CASE) {
                        tempChar = (char) (MIN_IN_UPPER_CASE + (tempChar + n - MAX_IN_UPPER_CASE - 1));
                    } else {
                        tempChar += n;
                    }
                } else {
                    if (tempChar + n > MAX_IN_LOWER_CASE) {
                        tempChar = (char) (MIN_IN_LOWER_CASE + (tempChar + n - MAX_IN_LOWER_CASE - 1));
                    } else {
                        tempChar += n;
                    }
                }
            } else {//n < 0
                if (isUpperCase(tempChar)) {
                    if (tempChar + n < MIN_IN_UPPER_CASE) {
                        tempChar = (char) (MAX_IN_UPPER_CASE - (MIN_IN_UPPER_CASE - (tempChar + n)) + 1);
                    } else {
                        tempChar += n;
                    }
                } else {
                    if (tempChar + n < MIN_IN_LOWER_CASE) {
                        tempChar = (char) (MAX_IN_LOWER_CASE - (MIN_IN_LOWER_CASE - (tempChar + n)) + 1);
                    } else {
                        tempChar += n;
                    }
                }
            }
            str.setCharAt(i, tempChar);
        }
        return str.toString();
    }

    public static String encrypt(String s, int n) {
        if (n < 0) return "";
        return moveChars(s, n);
    }

    public static String decrypt(String s, int n) {
        if (n < 0) return "";
        return moveChars(s, n * -1);
    }
}
