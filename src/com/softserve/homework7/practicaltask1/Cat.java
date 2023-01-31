package com.softserve.homework7.practicaltask1;

public class Cat implements Animal, Comparable<Cat>, Cloneable {

    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat() {
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
        if (!(o instanceof Cat)) return false;

        Cat cat = (Cat) o;

        if (getAge() != cat.getAge()) return false;
        return getName() != null ? getName().equals(cat.getName()) : cat.getName() == null;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + getAge();
        return result;
    }

    @Override
    public void voice() {
        System.out.println("Meow, meow!");
    }

    @Override
    public void feed() {
        System.out.println("Feeding a cat...");
    }

    @Override
    public int compareTo(Cat o) {
        return getName().compareTo(o.getName());
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
