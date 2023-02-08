package com.softserve.edu06.part2;

public class DevApp {
    public static void main(String[] args) {
        Employee[] workers = new Employee[4];
        workers[0] = new Employee("Mykola", 23, 2300);
        workers[1] = new Developer("Taras", 25, "Average Java developer", 1500);
        workers[2] = new Employee("Stanislav", 19, 1000);
        workers[3] = new Developer("Ivan", 29, "Senior Java developer", 5000);

        for (Employee el: workers) {
            System.out.println(el.report());
        }
    }
}
