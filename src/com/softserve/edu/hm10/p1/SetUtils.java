package com.softserve.edu.hm10.p1;

import java.util.HashSet;
import java.util.Set;

public class SetUtils {
    static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> setUnion = new HashSet<>(set1);
        for (T el : set2) {
            setUnion.add(el);
        }
        return setUnion;
    }

    static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        Set<T> setIntersect = new HashSet<>();
        for (T el : set1) {
            if (set2.contains(el)) setIntersect.add(el);
        }
        return setIntersect;
    }
}
