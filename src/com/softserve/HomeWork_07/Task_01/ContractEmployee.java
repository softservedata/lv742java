package com.softserve.HomeWork_07.Task_01;

import java.util.Objects;

public class ContractEmployee extends Employee implements Payment {
    private String employeeId;
    private String employeeName;
    private boolean federalTaxIdmember;
    private double fixedMonthlyPayment;

    public ContractEmployee(String employeeId, String employeeName, boolean federalTaxIdmember, double fixedMonthlyPayment) {
        super(employeeId);
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.federalTaxIdmember = federalTaxIdmember;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
        super.setAverageMonthlyWage(fixedMonthlyPayment);
    }

    @Override
    public double calculatePay() {
        return fixedMonthlyPayment;
    }

    @Override
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public boolean getFederalTaxIdmember() {
        return federalTaxIdmember;
    }

    public void setFederalTaxIdmember(boolean federalTaxIdmember) {
        this.federalTaxIdmember = federalTaxIdmember;
    }

    public double getFixedMonthlyPayment() {
        return fixedMonthlyPayment;
    }

    public void setFixedMonthlyPayment(double fixedMonthlyPayment) {
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContractEmployee that = (ContractEmployee) o;
        return Double.compare(that.fixedMonthlyPayment, fixedMonthlyPayment) == 0 && Objects.equals(employeeId, that.employeeId) && Objects.equals(employeeName, that.employeeName) && Objects.equals(federalTaxIdmember, that.federalTaxIdmember);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId, employeeName, federalTaxIdmember, fixedMonthlyPayment);
    }

    @Override
    public String toString() {
        return "ContractEmployee: " +
                "employeeId = " + employeeId +
                ", employeeName = " + employeeName + ", averageMonthlyWage = " + calculatePay() +
                ";\n";
    }
}
