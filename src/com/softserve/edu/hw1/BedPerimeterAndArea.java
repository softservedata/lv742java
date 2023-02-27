package com.softserve.edu.hw1;

import java.util.Scanner;

public class BedPerimeterAndArea {

    public static void getPerimeterAndArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of your bed");
        double radius = scanner.nextDouble();
        double perimeter = Math.PI * 2 * radius;
        double roundedPerimeter = Math.round(perimeter * 100.0) / 100.0;
        double area = Math.PI * radius * radius;
        double roundedArea = Math.round(area * 100.0) / 100.0;

        System.out.print("Perimeter equals " + roundedPerimeter + ", and area equals " + roundedArea);
    }

    public static void main(String[] args) {
        getPerimeterAndArea();
    }
}
