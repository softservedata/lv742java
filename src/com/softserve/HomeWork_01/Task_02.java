package com.softserve.HomeWork_01;

import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println("Where are you live, " + name + "?");
        String adress = sc.nextLine();

        System.out.println(name + " lives in " + adress + ".");
    }
}
