package com.softserve.edu.practical03.service;

public class EmployeeService {
    public double getSalary(double rate, double hours) {
        double salary = rate * hours;
        if (hours > 40) {
            return salary + getBonuses(salary);
        } else return salary;
    }

    public double getBonuses(double salary) {
        return salary * 10 / 100;
    }

    public double calcTotalSum(double[] salary){
        double sum = 0;
        for (double value: salary
             ) {
            sum +=value;
        }
        return sum;
    }
}
