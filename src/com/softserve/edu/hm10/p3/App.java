package com.softserve.edu.hm10.p3;

import com.softserve.edu.hm8.Student;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<StudentE> list = new ArrayList<>();
        list.add(new StudentE("Ivan", "Ivanov", 22, 5));
        list.add(new StudentE("Petro", "Petrov", 20, 3));
        list.add(new StudentE("Semen", "Semenov", 19, 2));
        list.add(new StudentE("Constantin", "Constantinov", 18, 1));
        list.add(new StudentE("Const", "Klius", 36, 5));

        list.sort(new StudentE.ByCourse());
        System.out.println("\nByCourse");
        System.out.println(list);

        list.sort(new StudentE.ByFirstName());
        System.out.println("\nByFirstName");
        System.out.println(list);

        System.out.println("\nprintStudents at 5 course");
        StudentE.printStudents(list, 5);
    }
}
