package com.softserve.edu.homework07_OOP_2;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Payment[] employees = new Payment[4];

        employees[0] = new SalariedEmployee("Emp1", "sara", 5000, "SSN1");
        employees[1] = new ContractEmployee("Emp1", 20, 160, "FTID1");
        employees[2] = new SalariedEmployee("Emp2", "sasha", 6000, "SSN2");
        employees[3] = new ContractEmployee("Emp2", 18, 170, "FTID3");

        Arrays.sort(employees, new Comparator<Payment>() {
            public int compare(Payment  e1, Payment e2) {
                return Double.compare(e2.calculatePay(), e1.calculatePay());
            }
        });

        for (Payment e : employees) {
            if (e instanceof SalariedEmployee) {
                SalariedEmployee se = (SalariedEmployee) e;
                System.out.println("Employee ID: " + se.employeeId + ", Name: " + se.getName() + ", Average Monthly Salary: $" + se.calculatePay());
            } else if (e instanceof ContractEmployee) {
                ContractEmployee ce = (ContractEmployee) e;
                System.out.println("Employee ID: " + ce.employeeId + ", Average Monthly Salary: $" + ce.calculatePay());
            }

        }
    }
}




