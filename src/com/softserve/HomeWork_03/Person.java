package com.softserve.HomeWork_03;

import java.time.LocalDate;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    //Getters:
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    //Constructors:
    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    //Methods:
    public int getAge() {
        return LocalDate.now().getYear() - birthYear;
    }

    public void input(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public void output() {
        System.out.println("Firstname: " + firstName + "\nLastname: " + lastName + "\nThe birthday year: " + birthYear + "\n");
    }

    public void changeName(String fn, String ln) {
        this.firstName = fn;
        this.lastName = ln;
    }

    public static void main(String[] args) {
        Person ivan = new Person();
        ivan.input("Ivan", "Ivanon", 2005);

        Person petro = new Person();
        petro.input("Petro", "Petrov", 1999);

        Person igor = new Person();
        igor.input("Igor", "Shkliarov", 2001);

        Person serhiy = new Person();
        serhiy.input("Serhiy", "Bilov", 1983);

        Person stepan = new Person();
        stepan.input("Stepan", "Kozak", 1995);
    }
}