package com.softserve.edu;

import com.softserve.edu03oop.App03;

public class Appl {
    public static void main(String[] args) {
        /*-
         * Here is a block comment with some very special
         * formatting that I want indent(1) to ignore.
         * one
         *         two
         *                 three
         */
        System.out.println("Hello world!");
        //App03 app03 = new App103();
        //
        for (String current : args) {
            System.out.println("current arguments = " + current);
        }
    }
}
