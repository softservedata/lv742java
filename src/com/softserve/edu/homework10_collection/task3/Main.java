package com.softserve.edu.homework10_collection.task3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Яна", 3));
        students.add(new Student("Марія", 2));
        students.add(new Student("Оксана", 1));
        students.add(new Student("Олександр", 4));
        students.add(new Student("Орест", 2));

        System.out.println("\nStudents sorted by name.\n");
        Collections.sort(students, new ListName());
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("\nStudents sorted by course.\n");
        Collections.sort(students, new ListCourse());
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
