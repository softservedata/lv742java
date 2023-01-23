package com.softserve.edu.homework06.employee;

public class App {

    public static void main(String[] args) {
        Developer dev = new Developer("Ivan", 24,  67570.99999, "Middle java developer");
        Employee dev2 = new Developer("Taras", 24,  70570.99999, "Middle java developer");
        System.out.println(dev.report());
        System.out.println(dev2.report());
    }
}
