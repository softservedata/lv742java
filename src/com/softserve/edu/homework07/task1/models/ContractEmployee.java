package com.softserve.edu.homework07.task1.models;

import com.softserve.edu.utils.Rounder;

import java.util.Objects;

public class ContractEmployee extends Employee implements Payment {

    private String federalTaxIdmember;
    private double fixMonthlyPayment;

    public ContractEmployee() {
    }

    public ContractEmployee(String employeeId, String firstName, String lastName, String federalTaxIdmember, double fixMonthlyPayment) {
        super(employeeId, firstName, lastName);
        this.federalTaxIdmember = federalTaxIdmember;
        this.fixMonthlyPayment = fixMonthlyPayment;
    }

    public String getFederalTaxIdmember() {
        return federalTaxIdmember;
    }

    public double getFixMonthlyPayment() {
        return fixMonthlyPayment;
    }

    public void setFederalTaxIdmember(String federalTaxIdmember) {
        this.federalTaxIdmember = federalTaxIdmember;
    }

    public void setFixMonthlyPayment(double fixMonthlyPayment) {
        this.fixMonthlyPayment = fixMonthlyPayment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ContractEmployee that = (ContractEmployee) o;
        return Double.compare(that.fixMonthlyPayment, fixMonthlyPayment) == 0 && Objects.equals(federalTaxIdmember, that.federalTaxIdmember);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), federalTaxIdmember, fixMonthlyPayment);
    }

    @Override
    public double calculatePay() {
        return getFixMonthlyPayment();
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "employeeId='" + super.getEmployeeId() + '\'' +
                ", firstName='" + super.getFirstName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                ", salary=" + Rounder.roundValue(calculatePay()) +

                '}';
    }
}
