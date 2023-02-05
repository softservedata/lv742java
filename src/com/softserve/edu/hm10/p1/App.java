package com.softserve.edu.hm10.p1;

import com.softserve.edu.hm10.p1.SetUtils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>(Arrays.asList(2, 4, 5, 6));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(3, -25, 5, 6));
        Set<Integer> un = SetUtils.<Integer>union(s1, s2);
        System.out.println("union\n" + un);
        Set<Integer> in = SetUtils.<Integer>intersect(s1, s2);
        System.out.println("intersect\n" + in);
    }
}
