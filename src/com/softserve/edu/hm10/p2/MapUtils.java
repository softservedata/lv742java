package com.softserve.edu.hm10.p2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapUtils {
    static public Map<String, String> fillMap(int size) {
        Map map = new HashMap<>(size);
        for (int i = 0; i < size; i++) {
            map.put("lN" + i, "fN" + i);
        }
        return map;
    }

    static public boolean checkDuplicate(Map<String, String> map) {
        boolean duplicate = false;
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> el : map.entrySet()) {
            copy.remove(el.getKey());
            if (copy.containsValue(el.getValue())) {
                duplicate = true;
                break;
            }
            copy = new HashMap<>(map);
        }
        return duplicate;
    }

    static public void deleteElementWithValue(Map<String, String> map, String value) {
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> el = iterator.next();
            if (el.getValue().equals(value)) {
                System.out.println("key = " + el.getKey());
                iterator.remove();
            }
        }
    }
}
