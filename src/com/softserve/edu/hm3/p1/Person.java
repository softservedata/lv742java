package com.softserve.edu.hm3.p1;

import java.time.LocalDate;
import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {
        firstName = "EmptyFirstName";
        lastName = "EmptyLastName";
        birthYear = 1990;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthYear(int birthYear) {
        int currentYear = LocalDate.now().getYear();
        if (birthYear > currentYear) {
            this.birthYear = currentYear;
        } else {
            this.birthYear = birthYear;
        }
    }

    public int getAge() {
        return LocalDate.now().getYear() - birthYear;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear + '\'' +
                ", age=" + getAge() +
                '}';
    }

    public void output() {
        System.out.println(this);
    }

    public void changeName(String fn, String ln) {
        this.firstName = fn;
        this.lastName = ln;
    }

    public void input(Scanner sc) {
        System.out.print("Input first name: ");
        this.setFirstName(sc.nextLine());
        System.out.print("Input last name: ");
        this.setLastName(sc.nextLine());
        System.out.print("Input year of your birth: ");
        this.setBirthYear(sc.nextInt());
        sc.nextLine();
    }
}
