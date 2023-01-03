package com.softserve.edu.homework01;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner in = new Scanner(System.in);

        String name = in.nextLine();
        System.out.println("Where are you live, " + name );
        String locality = in.nextLine();

        System.out.println("Hello "+name+", Your address:"+locality);
        in.close();

    }
}