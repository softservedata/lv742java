package com.softserve.homework7.practicaltask;

public class AnimalService {

    public Animal[] createAnimals() {
        Animal ronnie = new Dog("Ronnie", 4);
        Animal jack = new Dog("Jack", 2);
        Animal tom = new Cat("Tom", 1);
        Animal mickey = new Cat("Mickey", 6);
        return new Animal[]{ronnie, jack, tom, mickey};
    }

    public void output() {
        Animal[] pets = createAnimals();
        for (Animal pet : pets) {
            System.out.println(pet);
            pet.voice();
            pet.feed();
        }
    }
}
