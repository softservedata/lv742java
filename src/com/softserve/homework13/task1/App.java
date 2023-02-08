package com.softserve.homework13.task1;

public class App {

    public static void main(String[] args) {
        Encryption encryption = ((s, n) -> encrypt(s, n));
        Encryption decryption = ((s, n) -> decrypt(s, n));
        System.out.println(encryption.encryption("abc", 3));
        System.out.println(decryption.encryption("abc", 3));
    }

    public static String decrypt(String s, int n) {
        String encrypt = encrypt(s, n);
        char[] chars = encrypt.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (char aChar : chars) {
            char i = (char) (aChar - n);
            stringBuilder.append(i);
        }
        return new String(stringBuilder);
    }

    public static String encrypt(String s, int n) {
        char[] chars = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (char aChar : chars) {
            char i = (char) (aChar + n);
            stringBuilder.append(i);
        }
        return new String(stringBuilder);
    }

}
