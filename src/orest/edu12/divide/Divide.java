package orest.edu12.divide;

import java.util.Scanner;

public class Divide {

    public static void divideService() {
        Scanner scanner = new Scanner(System.in);
        double d1 = 0, d2 = 0;
        boolean inputMismatch = true;
        while (inputMismatch) {
            System.out.println("Enter first double");
            if (scanner.hasNextDouble())
                d1 = scanner.nextDouble();
            else {
                System.err.println("Please enter valid number");
                scanner.next();
                continue;
            }
            System.out.println("Enter second double");
            if (scanner.hasNextDouble())
                d2 = scanner.nextDouble();
            else {
                System.err.println("Please enter valid number");
                scanner.next();
                continue;
            }
            inputMismatch = false;
        }
        System.out.printf("The result of div = %.2f \n", div(d1, d2));
    }

    private static double div(double d1, double d2) {
        if (Double.isInfinite(d1 / d2)) {
            throw new ArithmeticException();
        } else {
            return d1 / d2;
        }
    }
}
