package com.softserve.edu.homework10_collection.task3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Student {
    private String name;
    private Integer course;

    public Student(String name, Integer course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public Integer getCourse() {
        return course;
    }

    static class StudentList {
        private List<Student> students;

        public StudentList() {
            students = new ArrayList<>();
        }

        public void addStudent(Student student) {
            students.add(student);
        }

        public void printStudents(List<Student> students, Integer course) {
            Iterator<Student> iterator = students.iterator();
            while (iterator.hasNext()) {
                Student student = iterator.next();
                if (course == null || student.getCourse().equals(course)) {
                    System.out.println(student.getName());
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Student name=" + name + ". Course="+ course;
    }
}
