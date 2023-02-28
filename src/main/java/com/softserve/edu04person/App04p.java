package com.softserve.edu04person;

public class App04p {

    public static void main(String[] args) {
        Person person = new Person();
        person.print();
        person.name = "Petro";
        person.print("Welcome ");
        //
        byte b = 1;
        b = (byte) (b + 1);
    }
}
