package com.softserve.edu.homework01;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String name;
        String address;
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name?");
        name = scan.nextLine();

        System.out.printf("Where are you live, %s?\n", name);
        address = scan.nextLine();

        System.out.println("----------------------------------------------");
        System.out.printf("Your name is %s and your address is %s.", name, address);

        scan.close();
    }
}
