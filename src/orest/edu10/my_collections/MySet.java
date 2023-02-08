package orest.edu10.my_collections;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MySet {
    public void setService() {
        Set<Integer> set1 = new HashSet<>(List.of(0, 1, 2, 3, 4, 5, 7));
        Set<Integer> set2 = new HashSet<>(List.of(5, 6, 7, 8, 9, 0, 4));

        System.out.println(union(set1, set2));
        System.out.println(intersect(set1, set2));
    }

    public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        return union;
    }

    public static Set<Integer> intersect(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> intersect = new HashSet<>(set1);
        intersect.retainAll(set2);
        return intersect;
    }
}
