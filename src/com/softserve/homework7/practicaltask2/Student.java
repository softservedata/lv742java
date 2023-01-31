package com.softserve.homework7.practicaltask2;

public class Student extends Person {

    private final String TYPE_PERSON = "Student";

    public Student() {
        System.out.println(TYPE_PERSON);
    }

    @Override
    public void print() {
        System.out.println("I am a Student");
    }

    @Override
    public int compareTo(Person o) {
        return getName().compareTo(o.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        if (!super.equals(o)) return false;

        Student student = (Student) o;

        return TYPE_PERSON != null ? TYPE_PERSON.equals(student.TYPE_PERSON) : student.TYPE_PERSON == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (TYPE_PERSON != null ? TYPE_PERSON.hashCode() : 0);
        return result;
    }
}
