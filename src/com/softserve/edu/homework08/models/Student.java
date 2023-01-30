package com.softserve.edu.homework08.models;

import com.softserve.edu.homework08.models.Person;

public class Student extends Person {
    private int course;

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }

    public Student() {
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String info() {
        return super.info() + " Course:" + course;
    }

    @Override
    public String activity() {
        return "\nMy activity: I study at university";
    }

}
