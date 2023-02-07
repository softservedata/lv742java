package com.softserve.homework12;

public class Calculator {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double num1 = 3.5435;
        double num2 = 5432;
        long num3 = 5432;
        calculator.div(num1, num3);
    }

    public void div(double num1, double num2) {
        double result = 0;
        try {
            result = num2 / num1;
        } catch (ArithmeticException ex) {
            System.out.println("Error found: " + ex);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println(result);
    }
}
