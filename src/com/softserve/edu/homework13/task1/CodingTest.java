package com.softserve.edu.homework13.task1;

import static java.lang.String.valueOf;

public class CodingTest {

    public static String encrypt(String s, int n) {
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            int charCode = chars[i];
            chars[i] = (char) (charCode + n);
        }
        return valueOf(chars);
    }

    public static String decrypt(String s, int n) {
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            int charCode = chars[i];
            chars[i] = (char) (charCode - n);
        }
        return valueOf(chars);
    }


}
