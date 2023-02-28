package com.softserve.practic04;

public class App {
    public static void main(String[] args) {
        Employee e1 = new Employee("Ivan", 10, 20);
        Employee e2 = new Employee("Petro", 5, 40);
        Employee e3 = new Employee("Ira", 20, 20);
        //
        System.out.println("Employee = " + e1 + "  getSalary() = " + e1.getSalary());
        System.out.println("Employee = " + e2 + "  getSalary() = " + e2.getSalary());
        System.out.println("Employee = " + e3 + "  getSalary() = " + e3.getSalary());
        //System.out.println("totalSum = " + e1.getTotalSum());
        System.out.println("totalSum = " + Employee.getTotalSum());

    }
}
