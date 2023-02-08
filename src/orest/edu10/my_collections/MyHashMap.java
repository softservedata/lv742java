package orest.edu10.my_collections;

import java.util.*;

public class MyHashMap {
    public void mapService() {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Aux", "Orest");
        personMap.put("Jackson", "Michael");
        personMap.put("Griffin", "Stewie");
        personMap.put("Smith", "Stan");
        personMap.put("Ruso", "Orest");
        personMap.put("Quinn", "Harley");
        personMap.put("Wayne", "Bruce");
        personMap.put("Pearce", "Aiden");
        personMap.put("Castle", "Frank");
        personMap.put("Cooper", "Helen");

        System.out.println("Original map.");
        personMap.forEach((K, V) -> System.out.println(K + " " + V));
        System.out.println();

        System.out.println("Map contains duplicate values = " + duplicateCheck(personMap) + ".");
        System.out.println();


        removeDuplicate(personMap, "Orest");
        System.out.println("Map after duplicate values was removed.");
        personMap.forEach((K, V) -> System.out.println(K + " " + V));

        System.out.println();
        System.out.println("Map contains duplicate values = " + duplicateCheck(personMap) + ".");
        System.out.println();
    }

    public static boolean duplicateCheck(Map<String, String> personMap) {
        Collection<String> list = personMap.values();
        Set<String> set = new HashSet<>(list);
        return set.size() < list.size();
    }

    public static void removeDuplicate(Map<String, String> personMap, String firstName) {
        personMap.entrySet().removeIf(value -> firstName.equals(value.getValue()));
    }
}


