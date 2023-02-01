package com.softserve.homework10.task3;

import java.util.List;

public class StudentApp {

    public static void main(String[] args) {
        StudentService service = new StudentService();
        List<Student> students = service.createStudents();
        System.out.println("Find students by course: ");
        service.printStudents(students, 2);
        students.sort(new Student.byName());
        System.out.println("\nStudents sorted by name: " + students);
        students.sort(new Student.byCourse());
        System.out.println("\nStudents sorted by course: " + students);

    }
}
