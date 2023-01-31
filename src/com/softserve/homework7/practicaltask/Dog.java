package com.softserve.homework7.practicaltask;

public class Dog implements Animal, Comparable<Dog>, Cloneable {

    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog)) return false;

        Dog dog = (Dog) o;

        if (getAge() != dog.getAge()) return false;
        return getName() != null ? getName().equals(dog.getName()) : dog.getName() == null;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + getAge();
        return result;
    }

    @Override
    public void voice() {
        System.out.println("Ruf,ruf!");
    }

    @Override
    public void feed() {
        System.out.println("Feeding a dog...");
    }

    @Override
    public int compareTo(Dog o) {
        return getName().compareTo(o.getName());
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
