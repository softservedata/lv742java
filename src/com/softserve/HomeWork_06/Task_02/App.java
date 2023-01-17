package com.softserve.HomeWork_06.Task_02;

public class App {
    public static void main(String[] args) {
        Employee employee = new Employee("Ivan", 23, 17859.90);
        System.out.println(employee.report());

        Employee developer = new Developer("Igor", 27, "Average Java developer", 48570.89);
        System.out.println(developer.report());
    }
}
