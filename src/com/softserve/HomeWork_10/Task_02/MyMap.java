package com.softserve.HomeWork_10.Task_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class MyMap {

    public void outputMap(Map<String, String> personMap) {
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println("\t" + entry.getKey() + " " + entry.getValue());
        }
    }

    public String copiesByFirstname(Map<String, String> map) {
        String result = "";
        List<String> firstnames = new ArrayList<>(map.values());

        for (Map.Entry<String, String> entry : map.entrySet()) {
            int counter = -1;
            String firstname = entry.getValue();
            for (String element : firstnames) {
                if (Objects.equals(firstname, element)) {
                    counter++;
                }
            }
            if (counter >= 1) {
                result += "There are " + (++counter) + " persons with firstname " + firstname + ".\n";
                firstnames.remove(firstname);
            }
        }

        if (result.equals("")) {
            result = "There any dublicates in this map";
        }

        return result;
    }

    public void removeByFirstname(Map<String, String> map, String firstname) {
        List<String> keysToDelete = new ArrayList<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (Objects.equals(entry.getValue(), firstname)) {
                keysToDelete.add(entry.getKey());
            }
        }

        for (String key : keysToDelete) {
            map.remove(key);
        }
    }
}
