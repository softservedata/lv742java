package com.softserve.edu11set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ProgTreeSet {

    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("10");
        set.add("05");
        set.add("08");
        set.add("03");
        set.add("12");
        for (String s : set) {
            System.out.println(s);
        }
    }

}
