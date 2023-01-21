package com.softserve.HomeWork_08;

import java.util.Objects;

public abstract class Person implements Cloneable {
    private Fullname fullname;
    private int age;

    public Person(Fullname fullname, int age) {
        this.fullname = fullname;
        this.age = age;
    }

    public String info() {
        return "First name: <" + fullname.getFirstName() +
                ">, Last name: <" + fullname.getLastName() +
                ">, Age: <" + getAge() + ">";
    }

    public abstract String activity();

    public Fullname getFullname() {
        return fullname;
    }

    public void setFullname(Fullname fullname) {
        this.fullname = fullname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static class Fullname implements Cloneable {
        private String firstName;
        private String lastName;

        public Fullname(String firstName, String lastName) {
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
            return "firstName = " + firstName +
                    ", lastName = " + lastName;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(fullname, person.fullname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullname, age);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person copyOfPerson = (Person) super.clone();
        copyOfPerson.fullname = (Fullname) copyOfPerson.fullname.clone();
        return copyOfPerson;
    }

    @Override
    public String toString() {
        return "Person: " + fullname +
                ", age = " + age + ".";
    }
}
