package com.softserve.homework14.practicaltask;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Service {


    public static void main(String[] args) {
        new Service().output();
    }

    private List<String> createStrings() {
        return Arrays.asList("bla", "", "simp",
                "", "second", "third", "third", "sec", "blablabla");
    }

    public long countEmpty(List<String> strings) {
        return strings.stream()
                .filter(String::isEmpty)
                .count();
    }

    public List<String> removeEmpty(List<String> strings, Predicate<String> predicate) {
        return strings.stream()
                .filter(s -> !predicate.test(s))
                .collect(Collectors.toList());
    }

    public String toUpperCase(List<String> strings) {
        return strings.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining());
    }

    private List<Integer> createNums() {
        return Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
    }

    public void getStats(List<Integer> nums) {
        IntSummaryStatistics stats = nums.stream().mapToInt((x) -> x).summaryStatistics();
        System.out.println("Count: " + stats.getCount());
        System.out.println("Min: " + (stats.getMin()));
        System.out.println("Max: " + (stats.getMax()));
        System.out.println("Sum: " + (stats.getSum()));
    }

    public void output() {
        Service service = new Service();
        List<String> strings = service.createStrings();
        System.out.println("\nOriginal list: " + strings);
        System.out.println("Empty strings count: " + countEmpty(strings));
        System.out.println("Remove empty strings: " + removeEmpty(strings, String::isEmpty));
        System.out.println("To uppercase and join: " + toUpperCase(strings));

        List<Integer> nums = createNums();
        System.out.println("\nOriginal list: " + nums);
        getStats(nums);
    }
}
