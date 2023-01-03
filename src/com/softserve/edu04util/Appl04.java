package com.softserve.edu04util;

import com.softserve.edu04person.Person;

public class Appl04 {

    Appl04() { // Overload
    }

    Appl04(int i) { // Overload
    }

    public static void main(String[] args) {
        Util.print("Ivan", 1, 5, 8, "abc", new Student("Petro", "Petrov"));
        Util.print("Ivan", new Student("Ivan", "Ivanov"));
        Person person = new Person();
        person.print();
        Appl04 a = new Appl04();
    }
}
