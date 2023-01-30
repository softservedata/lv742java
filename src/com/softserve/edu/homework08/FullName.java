package com.softserve.edu.homework08;
//Разработайте класс FullName с полями firstName и lastName типа String
public class FullName {
    public FullName(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
