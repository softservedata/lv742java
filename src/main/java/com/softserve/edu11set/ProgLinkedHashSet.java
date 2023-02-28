package com.softserve.edu11set;

import java.util.LinkedHashSet;
import java.util.Set;

public class ProgLinkedHashSet {
        public static void main(String[] args) {
                Set<String> set = new LinkedHashSet<>();
                //Set<String> set = new HashSet<>();
                set.add("Mike");
                set.add("Nike");
                set.add("Alex");
                set.add("Sara");
                //
                for (String object : set) {
                      System.out.println(object);
                }
        }
}