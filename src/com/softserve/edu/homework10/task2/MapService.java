package com.softserve.edu.homework10.task2;

import java.text.CollationKey;
import java.util.*;

public class MapService {

    public Map<String, String> createPersonMap() {
        Map<String, String> map = new HashMap<>();
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Oleksyn", "Anna"));
        personList.add(new Person("Fedoriv", "Svitlana"));
        personList.add(new Person("Gasyuk", "Nadiya"));
        personList.add(new Person("Danyliv", "Ivan"));
        personList.add(new Person("Matiiv", "Taras"));
        personList.add(new Person("Vynnyk", "Taras"));
        personList.add(new Person("Khomei", "Olga"));
        personList.add(new Person("Kapets", "Adriana"));
        personList.add(new Person("Sirkovych", "Marta"));
        personList.add(new Person("Gavrylyuk", "Svitlana"));

        for (int i = 0; i < personList.size(); i++) {
            map.put(personList.get(i).getLastName(), personList.get(i).getFirstName());
        }
        return map;
    }

    public boolean existTwoSameName(Map<String, String> map) {
        Collection<String> collection = map.values();

        Set<String> duplicates = new LinkedHashSet<>();
        Set<String> uniques = new HashSet<>();

        for (String t : collection) {
            if (!uniques.add(t)) {
                duplicates.add(t);
            }
        }
        if (duplicates.size() > 1) {
            return true;
        }
        return false;
    }

    public void deletePersonByName(Map<String, String> map, String firstName){
        String key = null;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if(entry.getValue().equalsIgnoreCase(firstName)){
                key = entry.getKey();
            }
        }
        map.remove(key);
    }

}
