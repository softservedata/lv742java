package com.softserve.edu08;

import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person st1 = new Student(new FullName("Ivan", "Dutchak"), 17, 1);
        Person st2 = new Student(new FullName("Vasyl", "Lysenko"), 19, 3);
        List<Person> lst = new LinkedList<>();
        lst.add(st1);
        lst.add(st2);
        for (Person current: lst) {
            System.out.println(current.info());
            System.out.println(current.activity());
        }
        Student st3 = (Student) lst.get(0).clone();
        st3.setCourse(2);
        lst.add(st3);

        for (Person current: lst) {
            System.out.println(current.info());
            System.out.println(current.activity());
        }
    }
}
