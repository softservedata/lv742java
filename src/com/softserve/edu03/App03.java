package com.softserve.edu03;

public class App03 {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.input("Kostya", "Kozub", 2005);
        Person person2 = new Person();
        person2.input("Ivan", "Kravchuk", 1979);
        Person person3 = new Person();
        person3.input("Stepan", "Bodnar", 1995);
        Person person4 = new Person();
        person4.input("Mykola", "Ilashuk", 2007);
        Person person5 = new Person();
        person5.input("Viktor", "Galushka", 1984);
        person5.changeName("Katya", "Lisna");
        person1.output();
        person2.output();
        person3.output();
        person4.output();
        person5.output();
    }
}
