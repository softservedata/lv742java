package com.softserve.HomeWork_01;

import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write c1: ");
        double c1 = sc.nextDouble();

        System.out.print("Write c2: ");
        double c2 = sc.nextDouble();

        System.out.print("Write c3: ");
        double c3 = sc.nextDouble();

        System.out.print("Write t1: ");
        double t1 = sc.nextDouble();

        System.out.print("Write t2: ");
        double t2 = sc.nextDouble();

        System.out.print("Write t3: ");
        double t3 = sc.nextDouble();

        System.out.println("Price1: " + (c1 * t1));
        System.out.println("Price2: " + (c2 * t2));
        System.out.println("Price3: " + (c3 * t3));
        System.out.println("Price for all talk together: " + (c1 * t1 + c2 * t2 + c3 * t3));
    }
}
