package com.softserve.homework1;

import java.util.Scanner;

public class FlowerBedCalculator {

    public static void getAreaAndPerimeter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of your flower bed");
        double radius = scanner.nextDouble();
        double area = Math.PI * radius * radius;
        double roundedArea = Math.round(area * 100.0) / 100.0;
        double perimeter = Math.PI * 2 * radius;
        double roundedPerimeter = Math.round(perimeter * 100.0) / 100.0;
        System.out.print("The area of your flower bed is " + roundedArea + ", the perimeter is " + roundedPerimeter);
    }

    public static void main(String[] args) {
        getAreaAndPerimeter();
    }
}
