package com.softserve.edu.homework10.task2;

import java.util.Map;

public class App {
    public static void main(String[] args) {
        MapService service = new MapService();
        Map<String, String> map = service.createPersonMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Lastname: " + entry.getKey() + " Firstname: " + entry.getValue());
        }
        System.out.println("-----------------------------------------");

        if(service.existTwoSameName(map)){
            System.out.println("There are two persons with the same name");
        } else System.out.println("No two people have the same name");

        System.out.println("-----------------------------------------");

        service.deletePersonByName(map, "Olga");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Lastname: " + entry.getKey() + " Firstname: " + entry.getValue());
        }
    }
}
