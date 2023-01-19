package com.softserve.homework7.task1;

public abstract class Employee {

    private long employeeId;

    public Employee(long employeeId) {
        this.employeeId = employeeId;
    }

    public Employee() {
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;

        Employee employee = (Employee) o;

        return getEmployeeId() == employee.getEmployeeId();
    }

    @Override
    public int hashCode() {
        return (int) (getEmployeeId() ^ (getEmployeeId() >>> 32));
    }
}
