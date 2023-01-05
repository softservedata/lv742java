package com.softserve.homework3;

public class EmployeeTestDrive {
    public static void main(String[] args) {
        Employee olha = new Employee("Olha",45, 33.5);
        Employee roman = new Employee("Roman",30, 22.5);
        Employee iren = new Employee("Iren",37, 29.4);
        System.out.println(olha);
        System.out.println(roman);
        System.out.println(iren);
        System.out.println("The total salary of all workers is " + String.format("$" + "%.2f", Employee.getTotalSum()));
    }
}
