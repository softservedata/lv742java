package com.softserve.edu.hm4.test;

import java.util.Scanner;

public class App {
    static public void main(String[] str) {
        byte b = (byte) 0x81;
        System.out.println(b);
        Scanner sc = new Scanner(System.in);
        var rez = switch (sc.nextInt()) {
            case 1, 2, 3 -> "123";
            case 4, 5, 6 -> "456";
            default -> "error";
        };
        System.out.println(rez);
        sc.close();
    }
}
