package com.softserve.HomeWork_14;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Employee implements Comparable<Employee>, Cloneable {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Optional<String> mostPopularName(Stream<Employee> employees) {
        Map<String, Long> mapOfNames = employees.map(Employee::getName)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return mapOfNames.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(value -> value.getKey());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public int compareTo(Employee o) {
        return this.getName().compareTo(o.getName());
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Employee: " +
                " name = " + name + ";";
    }

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Bob"));
        employeeList.add(new Employee("Din"));
        employeeList.add(new Employee("Sam"));
        employeeList.add(new Employee("Sam"));
        Stream<Employee> employeeStream = employeeList.stream();
        System.out.println(Employee.mostPopularName(employeeStream));
    }
}


