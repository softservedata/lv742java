package com.softserve.edu04util;

public class Util {

    public static void print(String msg, Object... messages) {
        System.out.println("\nWelcome: " + msg);
        for (Object current : messages) {
            System.out.print(current + "  "); // current.toString()
        }
    }

}
