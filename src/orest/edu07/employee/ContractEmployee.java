package orest.edu07.employee;

import orest.edu07.payment.Payment;

public class ContractEmployee extends Employee implements Payment, Comparable<ContractEmployee> {
    private int salary;
    private String federalTaxIdMember;

    public ContractEmployee(String id, String name, int salary, String federalTaxIdMember) {
        super(id, name);
        this.salary = salary;
        this.federalTaxIdMember = federalTaxIdMember;
    }

    public String getFederalTaxIdMember() {
        return federalTaxIdMember;
    }
    @Override
    public int compareTo(ContractEmployee employee) {
        return -this.salary + employee.salary;
    }

    @Override
    public int calculatePay() {
        return salary;
    }

    public String toString() {
        return "ContractEmployee: \n" +
                "id: " + super.getId() +
                ", name: " + super.getName() +
                ", federal tax id member: " + federalTaxIdMember +
                ", monthly wage: " + calculatePay();
    }
}
