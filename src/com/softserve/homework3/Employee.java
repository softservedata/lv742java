package com.softserve.homework3;

public class Employee {

    private String name;
    private double rate;
    private double hours;
    private static double totalSum;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public static double getTotalSum() {
        return totalSum;
    }

    public Employee() {
    }

    public Employee(String name, double rate, double hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public Employee(double rate, double hours) {
        this.rate = rate;
        this.hours = hours;
    }

    public double getSalary() {
        double salary = rate * hours;
        totalSum = totalSum + salary;
        return salary;
    }


    private double getBonuses() {
        double salary = getSalary();
        return salary*0.1;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", salary=" + String.format("$" + "%.2f", getSalary()) +
                ", bonuses=" + String.format("$" + "%.2f", getBonuses()) +
                '}';
    }


}
