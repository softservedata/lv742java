package com.softserve.HomeWork_04;

import java.util.Objects;

public class Dog {
    private String name;
    private Breed breed;
    private int age;

    private static int count = 0;
    private static int oldestDogAge = -1;
    private static String oldestDogName, oldestDogBreed;
    private static String name1, name2, name3;

    public Dog(String name, Breed breed, int age) {
        count++;
        this.name = name;
        this.breed = breed;
        this.age = age;

        if (age > oldestDogAge) {
            oldestDogAge = age;
            oldestDogBreed = String.valueOf(breed);
            oldestDogName = name;
        }

        if (count == 1) {
            name1 = name;
        } else if (count == 2) {
            name2 = name;
        } else if (count == 3) {
            name3 = name;
        }
    }

    public static String getSameNames() {
        if (Objects.equals(name1, name2) || Objects.equals(name2, name3)) {
            return "There are two dogs with name " + name2 + ".";
        } else if (Objects.equals(name1, name3)) {
            return "There are two dogs with name " + name3 + ".";
        } else {
            return "There are no dogs with the same name.";
        }
    }

    public static String getOldestDog() {
        return "The name of the oldest dog is " + Dog.oldestDogName + ", its breed - " + Dog.oldestDogBreed + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age && Objects.equals(name, dog.name) && breed == dog.breed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, breed, age);
    }

    @Override
    public String toString() {
        return "Dog: " +
                "name = " + name +
                ", breed = " + breed +
                ", age = " + age + ".";
    }
}
