package com.softserve.homework4;

public class Dog {

    private Breed breed;
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog(Breed breed) {
        this.breed = breed;
    }

    public Breed getBreed() {
        return breed;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void checkNames(Dog[] dogs) {
        for (int i = 0; i < dogs.length; i++) {
            for (int j = i+1; j < dogs.length; j++) {
               if(dogs[i].getName().equals(dogs[j].getName())) {
                   System.out.println("The dogs that have the same name: " + dogs[j].getName());
               }
            }
        }
    }

    public static void displayOldestDog(Dog[] dogs) {
        int maxAge = dogs[0].getAge();
        String name = dogs[0].getName();
        Breed dogBreed = dogs[0].getBreed();
        for (int i = 0; i < dogs.length; i++) {
               if(dogs[i].getAge()> maxAge) {
                   maxAge = dogs[i].getAge();
                   name = dogs[i].getName();
                   dogBreed = dogs[i].getBreed();
               }
           }
        System.out.println("The oldest dog is " + maxAge  +
                ", name " + name + ", breed " + dogBreed);

        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog)) return false;

        Dog dog = (Dog) o;

        if (getAge() != dog.getAge()) return false;
        if (getBreed() != dog.getBreed()) return false;
        return getName() != null ? getName().equals(dog.getName()) : dog.getName() == null;
    }

    @Override
    public int hashCode() {
        int result = getBreed().hashCode();
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + getAge();
        return result;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed=" + breed +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
