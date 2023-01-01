package com.softserve.HomeWork_01;

import java.util.Scanner;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Task_01 {
    public static void main(String[] args) {
        System.out.print("Write radius: ");
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();

        double perimetr = 2 * PI * radius;
        double area = PI * pow(radius, 2);

        System.out.println("Perimetr = " + perimetr);
        System.out.println("Area = " + area);
    }
}
