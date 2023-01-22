package com.softserve.edu.hm7;

import java.util.Comparator;
import java.util.Objects;

public abstract class AEmployee implements Comparable<AEmployee>, IPayment {
    private static int count;
    private String employeeId;
    private String name;

    static {
        count = 0;
    }

    public AEmployee(String name) {
        this.employeeId = "#" + ++count;
        this.name = name;
        //System.out.println("public Employee(String employeeId, String name)");
    }

    public AEmployee() {
        employeeId = "";
        name = "";
        //System.out.println("public Employee()");
    }

    public static class ByName implements Comparator<AEmployee> {
        @Override
        public int compare(AEmployee o1, AEmployee o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        AEmployee.count = count;
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
    public int compareTo(AEmployee o) {
        return (int) (-calculatePay() + o.calculatePay());
    }

    @Override
    public String toString() {
        return "\nAEmployee{" +
                "employeeId='" + employeeId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AEmployee aEmployee = (AEmployee) o;
        return employeeId.equals(aEmployee.employeeId) && name.equals(aEmployee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId, name);
    }
}
