package com.softserve.HomeWork_10.Task_03;

import java.util.*;

public class Student implements Comparable<Student> {
    private String name;
    private int course;

    public Student() {
    }

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public void printStudents(List<Student> students, Integer course) {
        boolean hasThisCourse = false;
        Iterator<Student> iterator = students.listIterator();
        while (iterator.hasNext()) {
            Student temp = iterator.next();
            if (temp.getCourse() == course) {
                System.out.println(temp);
                hasThisCourse = true;
            }
        }
        if (!hasThisCourse) {
            System.out.println("There are no students on " + course + " course.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, course);
    }

    @Override
    public int compareTo(Student o) {
        return this.getName().compareTo(o.getName());
    }

    public static class ByName implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    public static class ByCourse implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getCourse() - o2.getCourse();
        }
    }

    @Override
    public String toString() {
        return "\nStudent: " +
                "name = " + name +
                ", course = " + course;
    }
}
