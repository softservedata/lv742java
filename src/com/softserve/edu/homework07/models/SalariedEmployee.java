package com.softserve.edu.homework07.models;

import com.softserve.edu.utils.Rounder;

import java.util.Objects;

public class SalariedEmployee extends Employee implements Payment {

    private String socialSecurityNumber;
    private double rate;
    private double hours;

    public SalariedEmployee(){}
    public SalariedEmployee(String employeeId, String firstName, String lastName, String socialSecurityNumber, double rate, double hours) {
        super(employeeId, firstName, lastName);
        this.socialSecurityNumber = socialSecurityNumber;
        this.rate = rate;
        this.hours = hours;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }


    public double getRate() {
        return rate;
    }

    public double getHours() {
        return hours;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }


    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public double calculatePay() {
        return getRate() * getHours();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SalariedEmployee that = (SalariedEmployee) o;
        return Double.compare(that.rate, rate) == 0 && Double.compare(that.hours, hours) == 0 && Objects.equals(socialSecurityNumber, that.socialSecurityNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(socialSecurityNumber, rate, hours);
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "employeeId='" + super.getEmployeeId() + '\'' +
                ", firstName='" + super.getFirstName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                ", salary=" + Rounder.roundValue(calculatePay()) +
                '}';
    }
}
