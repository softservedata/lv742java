package com.softserve.edu.hm6.p2;

public class App {
    public static void main(String[] arg) {
        Employee[] array = new Employee[4];
        array[0] = new Developer("Ivan", 38, 100000, "Software middle engineer");
        array[1] = new Employee("Olga", 30, 40000);
        array[2] = new Developer("Dmitro", 31, 30000, "Trainee");
        array[3] = new Employee("Svitlana", 22, 15000);

        for (Employee el : array) {
            System.out.println(el.report());
        }
    }
}
