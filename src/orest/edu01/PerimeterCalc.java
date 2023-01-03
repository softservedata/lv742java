package orest.edu01;

import java.util.Scanner;

public class PerimeterCalc {

    public void circlePerimeterCalc() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius of the circle.");
        double radius = scanner.nextDouble();

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Perimeter is = " + String.format("%.2f", perimeter));
        System.out.println("Area is = " + String.format("%.2f", area));
    }
}

