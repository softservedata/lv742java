package orest.edu03;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PersonService {

    public List<Person> personConfigure() {
        Person person1 = new Person();
        person1.input("Orest", "Dymarchuk", LocalDate.parse("1994-01-14"));

        Person person2 = new Person();
        person2.input("Bartholomew", "Simpson", LocalDate.parse("1987-07-04"));

        Person person3 = new Person();
        person3.input("Stewie", "Griffin", LocalDate.parse("1999-12-30"));

        Person person4 = new Person();
        person4.input("Arthur", "Morgan", LocalDate.parse("1856-09-19"));

        Person person5 = new Person();
        person5.input("Bruce", "Wayne", LocalDate.parse("1915-04-15"));

        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        personList.add(person5);

        return personList;
    }
}
