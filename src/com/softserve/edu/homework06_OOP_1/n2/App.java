package com.softserve.edu.homework06_OOP_1.n2;

public class App {
    public static void main(String[] args) {
        Employee employee = new Employee("Iren", 22, "Manager", 32735.35);
        Developer developer = new Developer("Vasya", 26, "Average Java developer", 40000);
        System.out.println(employee.report());
        System.out.println(developer.report());
    }
}

