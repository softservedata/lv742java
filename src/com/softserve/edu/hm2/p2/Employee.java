package com.softserve.edu.hm2.p2;

import java.util.Scanner;

public class Employee {
    private String name;
    private int rate;
    private int hours;

    static private int totalSum;

    static {
        totalSum = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public static int getTotalSum(Employee[] listOfEmpl) {
        totalSum = 0;
        for (Employee el : listOfEmpl) {
            totalSum += el.getSalary();
        }
        return totalSum;
    }

    public static void setTotalSum(int totalSum) {
        Employee.totalSum = totalSum;
    }

    public Employee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public Employee() {
        this.rate = 0;
        this.hours = 0;
    }

    public int getSalary() {
        return rate * hours;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                ", salary=" + getSalary() +
                ", bonus=" + getBonuses() +
                '}';
    }

    public double getBonuses() {
        return (double) getSalary() * 0.01;
    }

    static public Employee input(Scanner sc) {
        Employee rezEmpl = new Employee();
        System.out.print("Input name: ");
        rezEmpl.setName(sc.nextLine());
        System.out.print("Input rate: ");
        rezEmpl.setRate(sc.nextInt());
        System.out.print("Input hours: ");
        rezEmpl.setHours(sc.nextInt());
        sc.nextLine();
        return rezEmpl;
    }
}
