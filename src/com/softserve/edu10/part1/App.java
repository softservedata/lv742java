package com.softserve.edu10.part1;

import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        SetOperations operations = new SetOperations();
        Set<Object> set1 = new HashSet<>();
        Set<Object> set2 = new HashSet<>();

        set1.add("Hi");
        set1.add("my");
        set1.add("name");
        set1.add("is");

        set2.add(9);
        set2.add(null);
        set2.add("name");
        set2.add("is");

        operations.union(set1, set2);
        operations.intersect(set1, set2);
    }
}
