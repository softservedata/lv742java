package com.softserve.edu.homework10.task1;

import java.util.HashSet;
import java.util.Set;

public class SetService {

    public Set union(Set set1, Set set2){
        Set s = new HashSet<>(set1);

        s.addAll(set2);

        return s;
    }

    public Set intersect(Set set1, Set set2){
        Set s = new HashSet<>(set1);
        s.retainAll(set2);

        return s;
    }

}
