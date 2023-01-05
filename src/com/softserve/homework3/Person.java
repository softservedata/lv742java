package com.softserve.homework3;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Person {

    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getAge() {
        int birthYear1 = getBirthYear();
        int currentYear = LocalDateTime.now().getYear();
        if((birthYear1 != 0)) {
            return currentYear - getBirthYear();
        }
        throw new IllegalStateException("Impossible to get age: birth year doesn't exist");
    }

    public static Person input() {
        Scanner scanner = new Scanner(System.in);
        Person person = new Person();
        System.out.println("Enter first name");
        person.setFirstName(scanner.nextLine());
        System.out.println("Enter last name");
        person.setLastName(scanner.nextLine());
        System.out.println("Enter birth year");
        String line = scanner.nextLine();
        scanner.close();
        int age = Integer.parseInt(line);
        person.setBirthYear(age);
        System.out.println("The person is created. The person data is " +
                person.getFirstName() + " " +
                person.getLastName() + " " +
                person.getBirthYear());
        return person;
    }

    public void output() {
        System.out.print("The person name is " + getFirstName() + " " + getLastName() + ","+ " ");
        System.out.println("the age is " + getAge());
    }

    public void changeName(String fn, String ln) {
        if((fn != null) && (!fn.equals(""))){
            setFirstName(fn);
        }
        if((ln != null) && (!ln.equals(""))){
            setLastName(ln);
        }
    }

}
