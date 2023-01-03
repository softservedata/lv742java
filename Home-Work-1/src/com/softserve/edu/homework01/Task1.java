package com.softserve.edu.homework01;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        double radius;
        double area;
        double perimeter;
        Scanner scan;

        scan = new Scanner(System.in);

        System.out.println("Enter the radius of the circle: ");
        radius = scan.nextDouble();

        area = Math.PI * Math.pow(radius, 2);
        perimeter = 2 * Math.PI * radius;

        System.out.println("_____________________________________________");
        System.out.printf("The area of the circle is equal to %.2f \n", area);
        System.out.printf("The perimeter of the circle is equal  to %.2f\n", perimeter);

        scan.close();
    }
}