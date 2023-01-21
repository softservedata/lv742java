package com.softserve.HomeWork_08;

import java.util.Objects;

public class Student extends Person {
    private int studentCourse;

    public Student(Fullname fullname, int age, int studentCourse) {
        super(fullname, age);
        this.studentCourse = studentCourse;
    }

    public int getStudentCourse() {
        return studentCourse;
    }

    public void setStudentCourse(int studentCourse) {
        this.studentCourse = studentCourse;
    }

    @Override
    public String info() {
        return "First name: <" + getFullname().getFirstName() +
                ">, Last name: <" + getFullname().getLastName() +
                ">, Age: <" + getAge() + ">" + ", the course the student is taking = " + studentCourse + ".";
    }

    @Override
    public String activity() {
        return "I study at university.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return studentCourse == student.studentCourse;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), studentCourse);
    }

    @Override
    public String toString() {
        return "Student: " + getFullname() + ", student`s age = " + getAge() +
                ", the course the student is taking = " + studentCourse + ".";
    }
}

