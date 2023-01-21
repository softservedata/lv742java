package com.softserve.HomeWork_07.Task_01;

import java.util.Objects;

public class SalariedEmployee extends Employee implements Payment {
    private String employeeId;
    private String employeeName;
    private String socialSecurityNumber;
    private double hourlyRate;
    private double numberOfHoursWorked;

    public SalariedEmployee(String employeeId, String employeeName, String socialSecurityNumber, double hourlyRate, double numberOfHoursWorked) {
        super(employeeId);
        super.setAverageMonthlyWage(hourlyRate * numberOfHoursWorked);
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.hourlyRate = hourlyRate;
        this.numberOfHoursWorked = numberOfHoursWorked;

    }

    @Override
    public double calculatePay() {
        return hourlyRate * numberOfHoursWorked;
    }

    @Override
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
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

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SalariedEmployee that = (SalariedEmployee) o;
        return Double.compare(that.hourlyRate, hourlyRate) == 0 && Double.compare(that.numberOfHoursWorked, numberOfHoursWorked) == 0 && Objects.equals(employeeId, that.employeeId) && Objects.equals(employeeName, that.employeeName) && Objects.equals(socialSecurityNumber, that.socialSecurityNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId, employeeName, socialSecurityNumber, hourlyRate, numberOfHoursWorked);
    }

    @Override
    public String toString() {
        return "SalariedEmployee: " +
                "employeeId = " + employeeId +
                ", employeeName = " + employeeName + ", averageMonthlyWage = " + calculatePay() + ";\n";
    }
}
