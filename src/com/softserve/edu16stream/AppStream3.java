package com.softserve.edu16stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class AppStream3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        //List<Integer> numbers = Arrays.asList();
        List<String> squaresList = numbers.stream()
                .distinct()
                .map(i -> String.valueOf(i * i) + "*")
                .collect(Collectors.collectingAndThen(Collectors.toList(), Optional::of ))
                .filter(list -> !list.isEmpty())
                .orElseThrow(() -> new RuntimeException("blah"));

                        //list -> list.isEmpty() ? list : list ));
                //.collect(Collectors.toList());
        squaresList.forEach(System.out::print);
    }
}
