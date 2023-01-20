package com.softserve.homework8;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) throws CloneNotSupportedException {
        Person dima = new Student(new FullName("Dima", "Divnych"), 13, 13);
        Person anna = new Student(new FullName("Anna", "Semenova"), 23, 1);
        List<Person> list = new ArrayList<>();
        list.add(dima);
        list.add(anna);

        System.out.println("Before cloning-----------");
        for (Person person : list) {
            System.out.println(person.info());
            System.out.println(person.activity());
        }

        Student dima2 = (Student) dima.clone();
        dima2.setCourseId(22);
        list.add(dima2);

        System.out.println("After cloning-----------");
        for (Person person : list) {
            System.out.println(person.info());
            System.out.println(person.activity());
        }
    }


}
