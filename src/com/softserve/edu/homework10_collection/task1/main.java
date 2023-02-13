package com.softserve.edu.homework10_collection.task1;

import java.util.HashSet;
import java.util.Set;


public class main {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);


        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(3);
        set2.add(4);

        Set<Integer> union =SetOperations.union(set1, set2);
        Set<Integer> intersect = SetOperations.intersect(set1, set2);

        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        System.out.println("Union: " + union);
        System.out.println("Intersect: " + intersect);
    }
}

