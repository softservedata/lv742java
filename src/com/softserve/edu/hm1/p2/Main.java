package com.softserve.edu.hm1.p2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Task1. Calculate the perimeter and area.");
        System.out.print("Input radius: ");
        float r = sc.nextFloat();
        double a = r*r*Math.PI;
        double c = 2*r*Math.PI;
        System.out.println("Area is: " + a);
        System.out.println("Perimeter is: " + c + "\n");

        System.out.println("Task2. Name and address.");
        String name, address;
        System.out.print("What is your name? ");
        name = sc.next();
        System.out.print("Where are you live, " + name + "? ");
        address = sc.next();
        System.out.println("Name is " + name + ". Address is " + address + ".\n");

        System.out.println("Task3. How much computer will count?");
        double price[] = new double[3];
        int time[] = new int[3];
        double total = 0;

        for(int i = 0; i < 3; i++)
        {
            System.out.print("Input price of one minute phone talk for country #" + (i+1) + ": ");
            price[i] = sc.nextDouble();
            System.out.print("Input duration of phone talk for country #" + (i+1) + ": ");
            time[i] = sc.nextInt();
            System.out.println("Cost of call #" + (i+1) + ": " + (price[i]*time[i]));
            total+=price[i]*time[i];
        }
        System.out.print("Total cost: " + total);

        sc.close();
    }
}
