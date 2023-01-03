package com.softserve.edu.homework01;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        double c1;
        double c2;
        double c3;
        double t1;
        double t2;
        double t3;
        double price1;
        double price2;
        double price3;
        double sum;

        Scanner scan = new Scanner(System.in);

        System.out.println("What is the price of the first call?");
        c1 = scan.nextDouble();
        System.out.println("How many minutes did the first call last?");
        t1 = scan.nextDouble();

        System.out.println("What is the price of the second call?");
        c2 = scan.nextDouble();
        System.out.println("How many minutes did the second call last?");
        t2 = scan.nextDouble();

        System.out.println("What is the price of the third call?");
        c3 = scan.nextDouble();
        System.out.println("How many minutes did the third call last?");
        t3 = scan.nextDouble();

        price1 = c1 * t1;
        price2 = c2 * t2;
        price3 = c3 * t3;
        sum = price1 + price2 + price3;

        System.out.printf("The first call cost %.2f standard units, the second %.2f standard units and the third %.2f standard units\n", price1, price2, price3);
        System.out.printf("The cost of three calls together: %.2f\n", sum);

        scan.close();
    }
}
