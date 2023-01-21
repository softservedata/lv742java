package com.softserve.HomeWork_07.Task_01;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Employee ivan = new SalariedEmployee("1312", "Ivan", "536768",500, 160);
        Employee andriy = new ContractEmployee("5414", "Andriy", true,47932.99);
        Employee petro = new SalariedEmployee("4214", "Petro", "573847",850, 140);
        Employee igor = new ContractEmployee("6532", "Igor", false,47932.6);
        Employee stepan = new SalariedEmployee("8302", "Stepan", "712964",700, 120);
        Employee[] employees = {ivan, andriy, petro, igor, stepan};
        Arrays.sort(employees, new Employee());
        for (Employee employee : employees) {
            System.out.print(employee);
        }
    }
}
