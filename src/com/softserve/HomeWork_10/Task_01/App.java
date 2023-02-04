package com.softserve.HomeWork_10.Task_01;

import java.util.*;

public class App {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(20);
        set1.add(35);
        set1.add(4);
        set1.add(15);
        Set<Integer> set2 = new HashSet<>();
        set2.add(6);
        set2.add(7);
        set2.add(8);
        set2.add(20);
        set2.add(1);

        MySet<Integer> mySet = new MySet<>();
        System.out.println("After union: " + mySet.union(set1, set2));
        System.out.println("After intersection: " + mySet.intersect(set1, set2));
    }
}
