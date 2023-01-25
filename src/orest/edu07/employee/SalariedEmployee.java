package orest.edu07.employee;

import orest.edu07.payment.Payment;

public class SalariedEmployee extends Employee implements Payment, Comparable<SalariedEmployee> {
    private int hourlyRate;
    private int numberOfHoursWorked;
    private String socialSecurityNumber;

    public SalariedEmployee(String id, String name, String socialSecurityNumber, int hourlyRate, int numberOfHoursWorked) {
        super(id, name);
        this.socialSecurityNumber = socialSecurityNumber;
        this.hourlyRate = hourlyRate;
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public int getNumberOfHoursWorked() {
        return numberOfHoursWorked;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    @Override
    public int compareTo(SalariedEmployee employee) {
        return -calculatePay() + employee.calculatePay();
    }

    @Override
    public int calculatePay() {
        return hourlyRate * numberOfHoursWorked;
    }

    @Override
    public String toString() {
        return "SalariedEmployee: \n" +
                "id: " + super.getId() +
                ", name: " + super.getName() +
                ", social security number: " + socialSecurityNumber +
                ", monthly wage: " + calculatePay();
    }
}
