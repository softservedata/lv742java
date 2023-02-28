package com.softserve.edu04person;

public class Person {
    String name;

    // Overload
    public void print() {
        System.out.println(name);
    }

    // Overload
    public void print(String s) {
        System.out.println(s + " " + name);
    }
}
