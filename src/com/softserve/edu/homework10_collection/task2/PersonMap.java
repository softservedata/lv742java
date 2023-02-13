package com.softserve.edu.homework10_collection.task2;

import java.util.HashMap;
import java.util.Map;

public class PersonMap {
    private Map<String, Person> personMap;
    public PersonMap(){
        this.personMap=new HashMap<>();
    }
    public void addPerson(Person person){
        personMap.put(person.getLastName(), person);
    }
    public void removePerson(String firstName){
        personMap.values().removeIf(Person->Person.getFirstName().equals(firstName));
    }
    public void printEntities(){
        System.out.println("Entities in the map: "+"\n");
        for (Map.Entry<String, Person> entry : personMap.entrySet()){
            System.out.println(entry.getValue());
        }
    }


}