package com.softserve.edu10list;

import java.util.*;

public class ProgCollections {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("second", "third", "fourth", "first", "first");
        Collections.reverse(list);
        System.out.println(list);

        // sorting
        Collections.sort(list);
        System.out.println(list);

        //reverse sort order
        //Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

        // uses a binary search algorithm to find a specific element;
        // returns the element number or a negative number
        System.out.println(Collections.binarySearch(list, "second"));

        //randomly reorders elements
        Collections.shuffle(list);
        System.out.println("After shuffling: " + list);

        // max value, min value,
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));

        //cyclically shifts the elements passed to it by distance
        // positions forward (+) or backward (-)
        Collections.rotate(list, -1);
        System.out.println(list);

        // copy collection
        //List<String> listDestination = Arrays.asList("green", "black");
        List<String> listDestination = new ArrayList<>();
        Collections.copy(list, listDestination);
        System.out.println(list);

        //eturns the total number of occurrences of the
        // specified element in the list
        System.out.println(Collections.frequency(list, "first"));
    }
}
