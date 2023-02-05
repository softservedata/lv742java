package com.softserve.edu.homework07_OOP_2;

class ContractEmployee extends Employee implements Payment {
private double hourlyRate;
private int numberOfHoursWorked;
private String federalTaxId;

        ContractEmployee(String employeeId, double hourlyRate, int numberOfHoursWorked, String federalTaxId) {
            super(employeeId);
            this.hourlyRate = hourlyRate;
            this.numberOfHoursWorked = numberOfHoursWorked;
            this.federalTaxId = federalTaxId;
        }

        @Override
        public double calculatePay() {
            return hourlyRate * numberOfHoursWorked;
        }
    @Override
    public String getEmployeeId() {
        return employeeId;
    }
}
