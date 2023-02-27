package com.softserve.edu13.part1;

public class App {
    public static void main(String[] args) {
        CharCoding encryption = App::encrypt;
        CharCoding decryption = App::decrypt;

        System.out.println(encryption.code("abc", 3));
        System.out.println(decryption.code(encryption.code("abc", 3), 3));
    }
    public static String encrypt(String s, int n){
        char[] charArr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int charCode : charArr) {
            sb.append((char) (charCode + n));
        }
        return sb.toString();
    }

    public static String decrypt(String s, int n){
        char[] charArr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int charCode : charArr) {
            sb.append((char) (charCode - n));
        }
        return sb.toString();
    }

}
