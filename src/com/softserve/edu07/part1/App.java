package com.softserve.edu07.part1;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];
        employees[0] = new ContractEmployee("456", "Ivan", "4567", 900);
        employees[1] = new SalariedEmployee("567", "Vasyl", "76997", 20, 100);
        employees[2] = new ContractEmployee("768", "Kostya", "342468", 2500);
        employees[3] = new SalariedEmployee("9434287", "Sergiy", "7878358676", 10, 150);
        for (Employee el: employees) {
            System.out.println(el);
        }
        Arrays.sort(employees);

        for (Employee el: employees) {
            System.out.println("\t" +  el + "\t");
        }
    }
}
