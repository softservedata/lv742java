package com.softserve.edu.homework07_OOP_2;


public class SalariedEmployee extends Employee implements Payment {
    private double fixedMonthlyPayment;
    private String socialSecurityNumber;
    private String name;

    SalariedEmployee(String employeeId, String name, double fixedMonthlyPayment, String socialSecurityNumber) {
        super(employeeId);
        this.fixedMonthlyPayment = fixedMonthlyPayment;
        this.socialSecurityNumber = socialSecurityNumber;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    @Override
    public double calculatePay() {
        return fixedMonthlyPayment;
    }
    @Override
    public String getEmployeeId() {
        return employeeId;
    }

}
