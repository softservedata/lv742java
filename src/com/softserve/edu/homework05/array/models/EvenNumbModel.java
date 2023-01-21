package com.softserve.edu.homework05.array.models;

public class EvenNumbModel {
    public int getProdEvenNumb(int[] arr) {
        int prod = 1;
        for (int current :
                arr) {
            if (current % 2 == 0) {
                prod *= current;
            }
        }
        return prod;
    }
    public final String getMessage(){
        return "The product of even numbers is equal ";
    }
}
