package com.softserve.practic04;

public class Employee {
    private String name;
    private double rate;
    private double hours;
    private static double totalSum = 0;

    public Employee(String name, double rate, double hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public double getRate() {
        return rate;
    }

    public double getHours() {
        return hours;
    }

    public static double getTotalSum() {
        return totalSum;
    }

    public double getSalary() {
        double result = rate * hours;
        totalSum = totalSum + result;
        return result;
    }
}
