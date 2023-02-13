package com.softserve.edu.homework10_collection.task2;

public class Person {
    private String lastName;
    private String firstName;
    public Person(String lastName, String firstName){
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public String getLastName() {
        return lastName;
    }

//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }

    public String getFirstName() {
        return firstName;
    }

//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }

    @Override
    public String toString() {
        return "lastName= "+ lastName + ", firstName= " + firstName;
    }
}
