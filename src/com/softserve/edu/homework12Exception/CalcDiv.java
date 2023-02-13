package com.softserve.edu.homework12Exception;

public class CalcDiv {
    private double a_Number;
    private double b_Number;

    public CalcDiv(double a_Number, double b_Number) {
        this.a_Number = a_Number;
        this.b_Number = b_Number;
    }

    public double div() throws Exception {
        if (b_Number == 0) {
            throw new Exception("Error: Divide by zero.");
        }

        return a_Number / b_Number;
    }


}
