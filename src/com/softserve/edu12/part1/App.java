package com.softserve.edu12.part1;

public class App {
    public static double div(double num1, double num2) {
        try {
            return num1 / num2;
        } catch (ArithmeticException ex) {
            System.err.println("Exception was found: "  + ex);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return 0;
    }

    public static void main(String[] args) {
        double num1 = 56.8;
        double num2 = 78;
        System.out.println(div(num1, num2));
    }
}
