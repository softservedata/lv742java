package com.softserve.edu.hm14;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class test {
    public static void main(String[] args) {
        /*Stream<List<String>> stream = Stream.of(Arrays.asList("SoftServ ", "IT Academy "),
                Arrays.asList("IT Academy ", "Java "),
                Arrays.asList("Test ", "IT "));
        stream.flatMap(str -> str.stream())
                .filter(str -> str.contains("IT")).forEach(System.out::print);*/
        /*LocalDate date = LocalDate.of(2020, 9, 1);
        System.out.println(date.plusDays(5).minusWeeks(3));
        System.out.println(date);
        System.out.println(date.with(TemporalAdjusters.firstDayOfMonth()));
        System.out.println(date);*/
        /*Stream<Character> stream = Stream.of('1', '3', '1', '8', '6', '4');
        stream
                .sorted((x, y) -> y.compareTo(x))
                .filter(x -> x >= 8)
                .findFirst()
                .ifPresent(System.out::println);*/
        List<Integer> names = Arrays.asList(1, 2, 3, 4, 5, 6);
        names.forEach(x -> --x);
        System.out.println(names);
    }
}
