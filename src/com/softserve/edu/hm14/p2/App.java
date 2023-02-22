package com.softserve.edu.hm14.p2;

import com.softserve.edu.hm6.p2.Employee;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    static Optional<String> mostPopularName(Stream<Employee> employeeStream) {
        Map<String, Long> map = employeeStream.map(el -> el.getName()).
                collect(Collectors.groupingBy(name -> name, Collectors.counting()));
        return map.entrySet().stream().max(Comparator.comparing(el -> el.getValue())).map(eS -> eS.getKey());
    }

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Bob", 30, 1000));
        list.add(new Employee("Din", 31, 2000));
        list.add(new Employee("Sam", 29, 3000));
        list.add(new Employee("Sam", 35, 5000));

        System.out.println("Most popular name is: " + App.mostPopularName(list.stream()).get());
    }
}
