package com.softserve.edu.homework08.models;

import java.util.Objects;

public abstract class Person implements Comparable<Person>, Cloneable {

    private FullName fullName;
    private int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person() {
    }

    public FullName getFullName() {
        return fullName;
    }

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public class FullName implements Cloneable {
        private String firstName;
        private String lastName;

        public FullName() {
            this.firstName = "";
            this.lastName = "";
        }

        public FullName(String firstName, String lastName) {
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

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        @Override
        public String toString() {
            return "FullName [firstName=" + firstName + ", lastName=" + lastName + "]: " + age;
        }

    }

    public String info() {
        return "-----------------------------------------" + "\nFirst name: " + fullName.firstName + ", Last name: " + fullName.lastName + ", Age: " + age;
    }

    public abstract String activity();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(fullName, person.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, age);
    }

    @Override
    public int compareTo(Person person) {
        return getFullName().lastName.compareTo(person.getFullName().lastName);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Person myClone = (Person) super.clone();
        myClone.setFullName((FullName) getFullName().clone());
        return myClone;
    }
}
