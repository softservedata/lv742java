package com.softserve.edu07.part1;

import java.util.Objects;

public class ContractEmployee extends Employee{
    private String federalTaxIdMember;
    private double salary;

    public ContractEmployee(){
        super();
        federalTaxIdMember = "";
        salary = 0;
    }

    public ContractEmployee(String employeeId, String name, String federalTaxIdMember, double salary){
        super(employeeId, name);
        this.federalTaxIdMember = federalTaxIdMember;
        this.salary = salary;
    }

    public String getFederalTaxIdMember() {

        return federalTaxIdMember;
    }

    public void setFederalTaxIdMember(String federalTaxIdMember) {

        this.federalTaxIdMember = federalTaxIdMember;
    }

    public double getSalary() {

        return salary;
    }

    public void setSalary(double salary) {

        this.salary = salary;
    }

    @Override
    public double calculatePay() {

        return getSalary();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ContractEmployee that = (ContractEmployee) o;
        return Double.compare(that.salary, salary) == 0 && Objects.equals(federalTaxIdMember, that.federalTaxIdMember);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), federalTaxIdMember, salary);
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" + "id= " + getEmployeeId() +
                ", socialSecurityNumber= " + getFederalTaxIdMember() +
                ", name= " + getName() +
                ", average monthly wage= " + "$" + calculatePay() +
                "}";
    }
}
