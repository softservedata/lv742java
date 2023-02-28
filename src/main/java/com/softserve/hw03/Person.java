package com.softserve.hw03;

import java.time.LocalDate;

public class Person {
    private String firstName;
    private int  birthYear;

    public Person(String firstName, int birthYear) {
        this.firstName = firstName;
        this.birthYear = birthYear;
    }

    public int getAge() {
        //int curretYear = LocalDate.now().getYear();
        return LocalDate.now().getYear() - birthYear;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName = " + firstName  +
                ", birthYear = " + birthYear +
                ", age =" + getAge() +
                '}';
    }
}
