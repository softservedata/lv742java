package com.softserve.HomeWork_10.Task_03;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ihor", 3));
        students.add(new Student("Stepan", 4));
        students.add(new Student("Vasyl", 3));
        students.add(new Student("Petro", 2));
        students.add(new Student("Kostya", 1));

        Student student = new Student();
        students.sort(new Student.ByName());
        System.out.println("Ordered by field name: " + students);

        students.sort(new Student.ByCourse());
        System.out.println("\nOrdered by field course: " + students);
    }
}
