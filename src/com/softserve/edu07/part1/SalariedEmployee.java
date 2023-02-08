package com.softserve.edu07.part1;

import java.util.Objects;

public class SalariedEmployee extends Employee{
    private String socialSecurityNumber;
    private double hourlyRate;
    private double numberOfHoursWorked;

    public SalariedEmployee(){
        super();
        socialSecurityNumber = "";
        hourlyRate = 0;
        numberOfHoursWorked = 0;
    }

    public SalariedEmployee(String employeeId, String name, String socialSecurityNumber, double hourlyRate, double numberOfHoursWorked){
        super(employeeId, name);
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SalariedEmployee that = (SalariedEmployee) o;
        return Double.compare(that.hourlyRate, hourlyRate) == 0 && Double.compare(that.numberOfHoursWorked, numberOfHoursWorked) == 0 && Objects.equals(socialSecurityNumber, that.socialSecurityNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), socialSecurityNumber, hourlyRate, numberOfHoursWorked);
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" + "id= " + getEmployeeId() +
                ", socialSecurityNumber= " +  getSocialSecurityNumber()  +
                ", name= " + getName() +
                ", average monthly wage= " + "$" + calculatePay() +
                "}";
    }


}
