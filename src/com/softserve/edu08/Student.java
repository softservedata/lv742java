package com.softserve.edu08;

import java.util.Objects;

public class Student extends Person{
    private int course;

    public Student(){

    }

    public Student(FullName fullName, int age, int course){
        super(fullName, age);
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String info() {
        return "Info about Person: " + getFullName() + ", Age: " + getAge() + ", Course: " + getCourse();
    }

    @Override
    public String activity() {
        return "I study at university";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return course == student.course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), course);
    }

    @Override
    public String toString() {
        return "Student{" +
                "full name = " + getFullName() +
                ", age = " + getAge() +
                "course=" + course +
                "} ";
    }
}
