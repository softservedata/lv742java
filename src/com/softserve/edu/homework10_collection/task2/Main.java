package com.softserve.edu.homework10_collection.task2;

public class Main {
    public static void main(String[] args) {
        PersonMap personMap = new PersonMap();

        personMap.addPerson(new Person("C", "John"));
        personMap.addPerson(new Person("Johnson", "Jane"));
        personMap.addPerson(new Person("Williams", "James"));
        personMap.addPerson(new Person("Jones", "Michael"));
        personMap.addPerson(new Person("Brown", "Орест"));
        personMap.addPerson(new Person("Davis", "Emily"));
        personMap.addPerson(new Person("Miller", "Орест"));
        personMap.addPerson(new Person("Wilson", "William"));
        personMap.addPerson(new Person("Moore", "Daniel"));
        personMap.addPerson(new Person("Taylor", "Emily"));

        personMap.printEntities();

        System.out.println();
        System.out.println("Remove person with firstName 'Orest':"+"\n");
        personMap.removePerson("Орест");

        personMap.printEntities();
    }
}

