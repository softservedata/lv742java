package com.softserve.homework10.task2;

import java.util.*;

public class PersonService {

    public Map<String, String> personMap() {
        Map<String, String> persons = new HashMap<>();
        persons.put("Ukrainka", "Lesya");
        persons.put("Pchilka", "Olena");
        persons.put("Divnych", "Volodymyr");
        persons.put("Velykyi", "Volodymyr");
        persons.put("Sheptytskyi", "Andrey");
        persons.put("Skovoroda", "Gregory");
        persons.put("Shevchenko", "Taras");
        persons.put("Kostenko", "Lina");
        persons.put("Reign", "Orest");
        persons.put("Sichynkskyi", "Denys");
        return persons;
    }

    public boolean hasFirstNameDuplicates(Map<String, String> persons) {
        boolean duplicateFound = false;
        Collection<String> values = persons.values();
        Set<String> set = new HashSet<>(values);
        if (set.size() < values.size()) {
            duplicateFound = true;
        }
        return duplicateFound;
    }

    public List<String> getDuplicateFirstNames(Map<String, String> persons) {
        Set<String> set = new HashSet<>();
        List<String> names = new ArrayList<>();
        for (String firstName : persons.values()) {
            boolean uniqueValue = set.add(firstName);
            if (!uniqueValue) {
                names.add(firstName);
            }
        }
        return names;
    }

    public void outputPersonMap(Map<String, String> persons) {
        for (Map.Entry<String, String> entry : persons.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public void removeByFirstName(Map<String, String> persons, String inputFirstName) {
        String key = null;
        for (Map.Entry<String, String> entry : persons.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(inputFirstName)) {
                key = entry.getKey();
            }
        }
        persons.remove(key);
    }

    public void printResult() {
        Map<String, String> persons = personMap();
        System.out.println("The map entries: ");
        outputPersonMap(persons);
        System.out.println("\nThere are at least two persons with the same firstName? " + hasFirstNameDuplicates(persons));
        System.out.println("Duplicates found: " + getDuplicateFirstNames(persons));
        removeByFirstName(persons, "Taras");
        System.out.println("\nThe map after removing a person with a firstName Taras: ");
        outputPersonMap(persons);

    }


}
