package com.softserve.edu10.part1;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {

    public void union(Set<Object> set1, Set<Object> set2){
        System.out.println("After method union()");
        Set<Object> set3 = new HashSet<>(set1);
        set3.addAll(set2);
        for (Object current: set3) {
            System.out.println(current);
        }
    }

    public void intersect(Set<Object> set1, Set<Object> set2){
        System.out.println("After method intersect()");
        Set<Object> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        for (Object current: intersection) {
            System.out.println(current);
        }
    }
}
