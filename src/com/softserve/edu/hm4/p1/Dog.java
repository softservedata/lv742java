package com.softserve.edu.hm4.p1;

import java.util.Objects;
import java.util.Scanner;

public class Dog {
    private String name;
    private Breed breed;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog() {
        name = "No name";
        breed = Breed.UNKNOWN;
        age = 0;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed=" + breed +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age && name.equals(dog.name) && breed == dog.breed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, breed, age);
    }

    static public Dog input(Scanner sc) {
        Dog d = new Dog();

        System.out.print("Input name of dog: ");
        d.setName(sc.nextLine());
        System.out.print("Input breed of dog (");
        for (Breed el : Breed.values()) {
            System.out.print("'" + el.name() + "'");
        }
        System.out.print("): ");
        d.setBreed(Breed.valueOf(sc.nextLine().toUpperCase()));
        System.out.print("Input age of dog: ");
        d.setAge(sc.nextInt());
        sc.nextLine();

        return d;
    }

    //return index of oldest dog in mass
    static int findOldestDog(Dog[] mass) {
        int ageOfOldest = mass[0].getAge();
        int indexOfOldest = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i].getAge() > ageOfOldest) {
                ageOfOldest = mass[i].getAge();
                indexOfOldest = i;
            }
        }
        return indexOfOldest;
    }

    //return sameName, if sameName="" then we don't have any same name in the massif
    static String sameNameOfDog(Dog[] mass) {
        String sameName = "";
        for (int j = 0; j < mass.length; j++) {
            for (int i = j + 1; i < mass.length; i++) {
                if (mass[i].getName().equals(mass[j].getName())) {
                    sameName = mass[j].getName();
                    return sameName;
                }
            }
        }
        return sameName;
    }
}
