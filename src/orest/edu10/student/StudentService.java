package orest.edu10.student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentService {

    public void service() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Lesya", 4));
        studentList.add(new Student("Jessie", 2));
        studentList.add(new Student("Fred", 3));
        studentList.add(new Student("Anna", 5));
        studentList.add(new Student("Patrick", 3));
        studentList.add(new Student("Helena", 1));

        System.out.println("Not sorted list.");
        studentList.forEach(System.out::println);
        System.out.println();

        System.out.println("Sorted by course list.");
        Collections.sort(studentList);
        studentList.forEach(System.out::println);
        System.out.println();


        System.out.println("Sorted by name list.");
        studentList.sort(Comparator.comparing(Student::getName));
        studentList.forEach(System.out::println);
        System.out.println();


        System.out.println("Get from the list of students studying in a some course..");
        new Student().printStudents(studentList, 3).forEach(System.out::println);
    }
}
