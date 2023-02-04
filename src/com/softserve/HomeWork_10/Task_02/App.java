package com.softserve.HomeWork_10.Task_02;

import java.util.*;

public class App {

    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Topnyi", "Ihor");
        personMap.put("Petrenko", "Vasyl");
        personMap.put("Bilous", "Orest");
        personMap.put("Hornyi", "Stepan");
        personMap.put("Fedyk", "Andrii");
        personMap.put("Moroz", "Roman");
        personMap.put("Batenko", "Orest");
        personMap.put("Ivanenko", "Ivan");
        personMap.put("Varchuk", "Serhii");
        personMap.put("Volos", "Bohdan");

        MyMap myMap = new MyMap();
        System.out.println("Original map: ");
        myMap.outputMap(personMap);

        System.out.println("\n" + myMap.copiesByFirstname(personMap));

        myMap.removeByFirstname(personMap, "Orest");

        System.out.println("After removing: ");
        myMap.outputMap(personMap);
    }
}
