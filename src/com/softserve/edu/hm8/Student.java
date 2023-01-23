package com.softserve.edu.hm8;

public class Student extends APerson implements Cloneable {
    private int course;

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }

    public Student(String firstName, String lastName, int age, int course) {
        super();
        this.getFullName().setFirstName(firstName);
        this.getFullName().setLastName(lastName);
        this.setAge(age);
        this.course = course;
    }

    public Student() {
        super();
        this.course = 0;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String activity() {
        return "I study at university";
    }

    @Override
    public String info() {
        return super.info() + ", Course: " + course;
    }

    @Override
    public String toString() {
        return "\n" + info();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student copy = (Student) super.clone();
        FullName copyFN = (FullName) getFullName().clone();
        copy.setFullName(copyFN);
        return copy;
    }
}
