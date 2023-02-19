package com.softserve.edu10.part3;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Student implements Comparable<Student> {
    private String name;
    private Integer course;

    public Student(){

    }

    public Student(String name, int course){
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCourse() {
        return course;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }


    public static void printStudents(List<Student> students, Integer course){
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()){
            Student el = iterator.next();
            if(el.getCourse().equals(course)){
                System.out.println("\t" + el.getName());
            }
        }
    }

    @Override
    public int compareTo(Student o) {
        return name.compareTo(o.getName());
    }

    public static class byName implements Comparator<Student>{
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    public static class byCourse implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return o1.getCourse().compareTo(o2.getCourse());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(course, student.course);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, course);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}
