package com.softserve.HomeWork_07.Task_01;

import java.util.Comparator;

public class Employee implements Comparator<Employee> {
    private String employeeId;
    private double averageMonthlyWage;

    public Employee() {
    }

    public Employee(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setAverageMonthlyWage(double averageMonthlyWage) {
        this.averageMonthlyWage = averageMonthlyWage;
    }

    public double getAverageMonthlyWage() {
        return averageMonthlyWage;
    }

    @Override
    public int compare(Employee o1, Employee o2) {
        return Double.compare(o1.getAverageMonthlyWage(), o2.getAverageMonthlyWage());
    }
}

