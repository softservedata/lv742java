package com.softserve.edu01;

import java.util.Scanner;

public class Dz_01_part_1 {
    public static void main(String[] args) {
        System.out.print("Please enter radius: ");
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double perimeter = 2*radius*Math.PI;
        double area = radius*radius*Math.PI;
        System.out.println("Perimeter = " + perimeter);
        System.out.println("Area = " + area);
    }
}