package com.softserve.edu10.part3;

import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Student> students = new LinkedList<>();
        students.add(new Student("Kostya", 1));
        students.add(new Student("Viktor", 1));
        students.add(new Student("Nick", 2));
        students.add(new Student("Nazar", 2));
        students.add(new Student("Anna", 3));

        for (Student current: students) {
            System.out.println(current);
        }

        System.out.println("Sort by name");
        students.sort(new Student.byName());
        for (Student current: students) {
            System.out.println("\t" + current);
        }

        System.out.println("Sort by course");
        students.sort(new Student.byCourse());
        for (Student current: students) {
            System.out.println("\t" + current);
        }
        System.out.println("Students, which study in same course");
        Student.printStudents(students, 2);
    }
}
