package com.softserve.homework7.task1;

public class ContractEmployee extends Employee implements Payment, Comparable<ContractEmployee> {

    private String firstName;
    private String lastName;
    private String role;
    private double hourlyRate;
    private double totalHours;
    private boolean federalTaxIdMember;


    public ContractEmployee() {
    }

    public ContractEmployee(long employeeId) {
        super(employeeId);
    }

    public ContractEmployee(long employeeId,
                            String firstName,
                            String lastName,
                            String role,
                            double hourlyRate,
                            double totalHours,
                            boolean federalTaxIdMember) {
        super(employeeId);
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
        this.hourlyRate = hourlyRate;
        this.totalHours = totalHours;
        this.federalTaxIdMember = federalTaxIdMember;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(double totalHours) {
        this.totalHours = totalHours;
    }

    public boolean isFederalTaxIdMember() {
        return federalTaxIdMember;
    }

    public void setFederalTaxIdMember(boolean federalTaxIdMember) {
        this.federalTaxIdMember = federalTaxIdMember;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * totalHours;
    }

    @Override
    public int compareTo(ContractEmployee o) {
        return getLastName().compareTo(o.getLastName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ContractEmployee)) return false;
        if (!super.equals(o)) return false;

        ContractEmployee that = (ContractEmployee) o;

        if (Double.compare(that.getHourlyRate(), getHourlyRate()) != 0) return false;
        if (Double.compare(that.getTotalHours(), getTotalHours()) != 0) return false;
        if (isFederalTaxIdMember() != that.isFederalTaxIdMember()) return false;
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
        temp = Double.doubleToLongBits(getHourlyRate());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getTotalHours());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (isFederalTaxIdMember() ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "\nContractEmployee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", role='" + role + '\'' +
                ", hourlyRate=" + hourlyRate +
                ", totalHours=" + totalHours +
                ", federalTaxIdMember=" + federalTaxIdMember +
                '}';
    }
}
