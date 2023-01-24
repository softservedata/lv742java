package com.softserve.edu.homework06.employee;

public class App {

    public static void main(String[] args) {
        Developer dev1 = new Developer("Ivan", 24,  67570.99, "Java middle developer");
        Employee dev2 = new Developer("Taras", 26,  70570.99, "Java middle developer");
        Employee[] employees = {dev1, dev2};
        for (Employee emp:employees) {
            System.out.println(emp.report());
        }
    }
}
