package com.softserve.homework4;

public class DogTestDrive {

    public static void main(String[] args) {
        Dog retriever = new Dog(Breed.GOLDEN_RETRIEVER);
        retriever.setName("Lulu");
        retriever.setAge(3);

        Dog chihuahua = new Dog(Breed.CHIHUAHUA);
        chihuahua.setName("Lulus");
        chihuahua.setAge(7);

        Dog shepherd = new Dog(Breed.CHIHUAHUA);
        shepherd.setName("Mike");
        shepherd.setAge(10);

        Dog[] dogs = {retriever, chihuahua, shepherd};

        Dog.checkNames(dogs);
        Dog.displayOldestDog(dogs);


    }
}
