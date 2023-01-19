package com.softserve.homework7.task1;

public class SalariedEmployee extends Employee implements Payment, Comparable<SalariedEmployee>{

    private String firstName;
    private String lastName;
    private String role;
    private double fixedMonthlyPayment;
    private long socialSecurityNumber;


    public SalariedEmployee() {
    }

    public SalariedEmployee(long employeeId) {
        super(employeeId);
    }

    public SalariedEmployee(long employeeId,
                            String firstName, String lastName,
                            double fixedMonthlyPayment,
                            long socialSecurityNumber,
                            String role) {
        super(employeeId);
        this.firstName = firstName;
        this.lastName = lastName;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
        this.socialSecurityNumber = socialSecurityNumber;
        this.role = role;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getFixedMonthlyPayment() {
        return fixedMonthlyPayment;
    }

    public void setFixedMonthlyPayment(double fixedMonthlyPayment) {
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    public long getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(long socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public double calculatePay() {
        return getFixedMonthlyPayment();
    }

    @Override
    public int compareTo(SalariedEmployee o) {
        return getLastName().compareTo(o.getLastName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SalariedEmployee)) return false;
        if (!super.equals(o)) return false;

        SalariedEmployee that = (SalariedEmployee) o;

        if (Double.compare(that.getFixedMonthlyPayment(), getFixedMonthlyPayment()) != 0) return false;
        if (getSocialSecurityNumber() != that.getSocialSecurityNumber()) return false;
        if (getFirstName() != null ? !getFirstName().equals(that.getFirstName()) : that.getFirstName() != null)
            return false;
        if (getLastName() != null ? !getLastName().equals(that.getLastName()) : that.getLastName() != null)
            return false;
        return getRole() != null ? getRole().equals(that.getRole()) : that.getRole() == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        result = 31 * result + (getFirstName() != null ? getFirstName().hashCode() : 0);
        result = 31 * result + (getLastName() != null ? getLastName().hashCode() : 0);
        result = 31 * result + (getRole() != null ? getRole().hashCode() : 0);
        temp = Double.doubleToLongBits(getFixedMonthlyPayment());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (int) (getSocialSecurityNumber() ^ (getSocialSecurityNumber() >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "\nSalariedEmployee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", role='" + role + '\'' +
                ", fixedMonthlyPayment=" + fixedMonthlyPayment +
                ", socialSecurityNumber=" + socialSecurityNumber +
                '}';
    }
}
