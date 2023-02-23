package com.softserve.edu.homework13;

public class string {

    public static String encrypt(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                char encrypted = (char) ((c - 'a' + n) % 26 + 'a');
                sb.append(encrypted);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String decrypt(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                char decrypted = (char) ((c - 'a' + 26 - n) % 26 + 'a');
                sb.append(decrypted);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
