package com.softserve.edu.hm10.p2;

import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<String, String> map = MapUtils.fillMap(10);
        System.out.println(map);
        map.put("lN3", "fN0");
        System.out.println("map.put(\"lN3\", \"fN0\")");
        System.out.println(map);
        if (MapUtils.checkDuplicate(map)) {
            System.out.println("We have duplicate in this map");
        } else {
            System.out.println("We don't have any duplicate");
        }
        System.out.println("delete element with value " + "fN0");
        MapUtils.deleteElementWithValue(map, "fN0");
        System.out.println(map);
    }
}
