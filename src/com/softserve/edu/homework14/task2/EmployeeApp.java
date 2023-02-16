package com.softserve.edu.homework14.task2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static java.lang.CharSequence.compare;

public class EmployeeApp {
    static Optional<String> mostPopularName(Stream<Employee> employees) {
        return employees.max((o1, o2) -> compare(o1.getName(), o2.getName()))
                .map(Employee::getName);
    }

    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(new Employee("Ivan"), new Employee("Ann"), new Employee("Tom"), new Employee("Tom"));
        //List<Employee> list = new ArrayList<>();

        System.out.println(mostPopularName(list.stream()));

    }
}
