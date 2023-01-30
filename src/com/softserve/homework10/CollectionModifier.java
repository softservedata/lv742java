package com.softserve.homework10;

import java.util.HashSet;
import java.util.Set;

public class CollectionModifier {

    public Set<Integer> createSet1() {
        Set<Integer> collection = new HashSet<>();
        collection.add(1);
        collection.add(2);
        collection.add(3);
        return collection;
    }

    public Set<Integer> createSet2() {
        Set<Integer> collection = new HashSet<>();
        collection.add(3);
        collection.add(4);
        collection.add(5);
        collection.add(1);
        collection.add(2);
        return collection;
    }

    public <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> union = new HashSet<>(set1);
        union.addAll(set2);
        return union;
    }

    public <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        Set<T> intersect = new HashSet<>(set1);
        intersect.retainAll(set2);
        return intersect;
    }

    public void test() {
        Set<Integer> set1 = createSet1();
        Set<Integer> set2 = createSet2();
        System.out.println("Set1 : " + set1);
        System.out.println("Set2 : " + set2);
        System.out.println("\tUnion: " + union(set1, set2));
        System.out.println("Set1 : " + set1);
        System.out.println("Set2 : " + set2);
        System.out.println("\tIntersection: " + intersect(set1, set2));
        System.out.println("Set1 : " + set1);
        System.out.println("Set2 : " + set2);
    }

}
