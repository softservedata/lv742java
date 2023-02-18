package com.softserve.HomeWork_13;

public class Task_01 {
    public String encrypt(String s, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char t = (char) (s.charAt(i) + n);
            stringBuilder.append(t);
        }
        s = String.valueOf(stringBuilder);
        return s;
    }

    public String decrypt(String s, int n) {
        return new Task_01().encrypt(s, -n);
    }

    public static void main(String[] args) {
        Task_01 task01 = new Task_01();
        System.out.println(task01.encrypt("abcdefg", 3));
        System.out.println(task01.decrypt(task01.encrypt("abcdefg", 3), 3));
    }
}
