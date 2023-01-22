package com.softserve.edu.hm7;

import java.util.Objects;

//hourly paid
public class SalariedEmployee extends AEmployee {
    private String socialSecurityNumber;
    private double hourlyRate;
    private double numberOfHoursWorked;

    public SalariedEmployee() {
        super();
        this.socialSecurityNumber = "";
        this.hourlyRate = 0.0;
        this.numberOfHoursWorked = 0.0;
    }

    public SalariedEmployee(String name, String socialSecurityNumber, double hourlyRate, double numberOfHoursWorked) {
        super(name);
        this.socialSecurityNumber = socialSecurityNumber;
        this.hourlyRate = hourlyRate;
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getNumberOfHoursWorked() {
        return numberOfHoursWorked;
    }

    public void setNumberOfHoursWorked(double numberOfHoursWorked) {
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    @Override
    public double calculatePay() {
        return getHourlyRate() * getNumberOfHoursWorked();
    }

    @Override
    public String toString() {
        return "\nSalariedEmployee{" +
                "name='" + getName() + "'; " +
                "employeeId='" + getEmployeeId() + "'; " +
                "socialSecurityNumber='" + socialSecurityNumber + "'; " +
                "hourlyRate=" + hourlyRate + "'; " +
                "numberOfHoursWorked=" + numberOfHoursWorked + "'; " +
                "salary= " + calculatePay() +
                '}';
    }
}
