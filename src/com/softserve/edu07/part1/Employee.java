package com.softserve.edu07.part1;

import java.util.Objects;

public class Employee implements Comparable<Employee>, Payment{
    private String employeeId;
    private String name;

    Employee(){
        employeeId = "";
        name = "";
    }

    Employee(String employeeId, String name){
        this.employeeId = employeeId;
        this.name = name;
    }

    public String getEmployeeId() {

        return employeeId;
    }

    public void setEmployeeId(String employeeId) {

        this.employeeId = employeeId;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    @Override
    public int compareTo(Employee o) {

        return Double.compare(o.calculatePay(), calculatePay());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(employeeId, employee.employeeId) && Objects.equals(name, employee.name);
    }

    @Override
    public double calculatePay() {
        return 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId, name);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
