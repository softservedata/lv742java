package com.softserve.edu.homework10.task1;

import java.util.HashSet;
import java.util.Set;

public class Appl {

    public static void main(String[] args) {

        Set<String> set1 = new HashSet<>();
        set1.add("Mike");
        set1.add("Alex");
        set1.add("Sara");
        set1.add("Sam");

        Set<String> set2 = new HashSet<>();
        set2.add("Alex");
        set2.add("Sara");
        set2.add("Sam");
        set2.add("John");
        set2.add("Alice");

        SetService service = new SetService();

        System.out.println("1) " + set1);
        System.out.println("2) " + set2);
        System.out.println("-------------------------------------------");
        System.out.println("Intersect: " + service.intersect(set1, set2));
        System.out.println("Union: " + service.union(set1, set2));

    }


}
