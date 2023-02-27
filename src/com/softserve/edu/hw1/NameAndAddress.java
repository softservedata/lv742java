package com.softserve.edu.hw1;

import java.util.Scanner;

public class NameAndAddress {
    public static void askInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("Where do you live " + name + "?");
        String address = scanner.nextLine();

        System.out.println("Name: " + name + "\nAddress: " + address);
    }

    public static void main(String[] args) {
        askInput();
    }
}