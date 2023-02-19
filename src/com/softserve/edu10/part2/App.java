package com.softserve.edu10.part2;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Ramirez", "Nick");
        personMap.put("Morgan", "John");
        personMap.put("Washington", "Thomas");
        personMap.put("Richardson", "Miguel");
        personMap.put("Phillips", "Nick");
        personMap.put("Hall", "Helena");
        personMap.put("Patterson", "Juliana");
        personMap.put("Edwards", "Angelina");
        personMap.put("Morris", "Greta");
        personMap.put("Wood", "Angelina");

        for (Map.Entry<String, String> current: personMap.entrySet()) {
            System.out.println(current.getKey() + " " + current.getValue());
        }

        System.out.println("===============================================================");

        Set<String> set = personMap.keySet();

        personMap.entrySet().removeIf(entry -> entry.getValue().equals("Angelina"));

        for (Map.Entry<String, String> current: personMap.entrySet()) {
            System.out.println(current.getKey() + " " + current.getValue());
        }
    }
}
