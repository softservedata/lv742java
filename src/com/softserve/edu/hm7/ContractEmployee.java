package com.softserve.edu.hm7;

import java.util.Objects;

//fixed paid
public class ContractEmployee extends AEmployee {
    private String federalTaxIdMember;
    private int salary;

    public ContractEmployee() {
        super();
        this.federalTaxIdMember = "";
        this.salary = 0;
    }

    public ContractEmployee(String name, String federalTaxIdMember, int salary) {
        super(name);
        this.federalTaxIdMember = federalTaxIdMember;
        this.salary = salary;
    }

    public String getFederalTaxIdMember() {
        return federalTaxIdMember;
    }

    public void setFederalTaxIdMember(String federalTaxIdMember) {
        this.federalTaxIdMember = federalTaxIdMember;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public double calculatePay() {
        return salary;
    }

    @Override
    public String toString() {
        return "\nContractEmployee{" +
                "name='" + getName() + "'; " +
                "employeeId='" + getEmployeeId() + "'; " +
                "federalTaxIdMember='" + federalTaxIdMember + "'; " +
                "salary=" + salary +
                '}';
    }
}
