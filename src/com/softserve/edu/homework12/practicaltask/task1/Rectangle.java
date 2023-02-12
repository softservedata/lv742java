package com.softserve.edu.homework12.practicaltask.task1;

public class Rectangle extends Shape {
    private double a;
    private double b;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    double getArea() {
        try {
            if (a < 0 || b < 0) throw new ArithmeticException();
            return a * b;
        } catch (ArithmeticException exception) {
            System.out.println("Wrong value!");
        }
        return 0;
    }


}
