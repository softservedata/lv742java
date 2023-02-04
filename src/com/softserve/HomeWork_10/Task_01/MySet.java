package com.softserve.HomeWork_10.Task_01;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MySet<E> {

    public Set<E> union(Set<E> set1, Set<E> set2) {
        Set<E> union = null;
        if (set1 instanceof HashSet) {
            union = new HashSet<>(set1);
        }

        if (set1 instanceof LinkedHashSet) {
            union = new LinkedHashSet<>(set1);
        }

        if (set1 instanceof TreeSet) {
            union = new TreeSet<>(set1);
        }
        union.addAll(set2);
        return union;
    }

    public Set<E> intersect(Set<E> set1, Set<E> set2) {
        Set<E> intersection = null;
        if (set1 instanceof HashSet) {
            intersection = new HashSet<>(set1);
        }

        if (set1 instanceof LinkedHashSet) {
            intersection = new LinkedHashSet<>(set1);
        }

        if (set1 instanceof TreeSet) {
            intersection = new TreeSet<>(set1);
        }
        intersection.retainAll(set2);
        return intersection;
    }
}
