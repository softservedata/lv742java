package com.softserve.edu.utils;

import java.text.DecimalFormat;

public class Rounder {
    public static String roundValue(double value) {
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        return decimalFormat.format(value);
    }
}
