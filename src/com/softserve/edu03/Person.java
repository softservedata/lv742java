package com.softserve.edu03;

import java.time.LocalDate;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {
        firstName = "DefaultFirstName";
        lastName = "DefaultLastName";
        birthYear = 2000;
    }
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
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

    public int getAge(){
        return LocalDate.now().getYear() - birthYear;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName: " + this.getFirstName() +
                ", lastName: " + this.getLastName() +
                ", birthYear: " + this.getBirthYear() +
                ", age: " + getAge() +
                '}';
    }

    public void input(String fn, String ln, int bd){
        this.setFirstName(fn);
        this.setLastName(ln);
        this.setBirthYear(bd);
    }

    public void output(){
        System.out.println(this);
    }

    public void changeName(String fn, String ln){
        this.firstName = fn;
        this.lastName = ln;
    }
}
