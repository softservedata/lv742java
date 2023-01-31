package com.softserve.homework7.practicaltask2;

public class PersonService {

    public Person[] createPersons() {
        Person teacher1 = new Teacher();
        Person teacher2 = new Teacher();
        Person cleaner1 = new Cleaner();
        Person cleaner2 = new Cleaner();
        Person student1 = new Student();
        Person student2 = new Student();
        return new Person[]{teacher1, teacher2, cleaner1, cleaner2, student1, student2};
    }

    public void output() {
        Person[] persons = createPersons();
        for (Person person : persons) {
            person.print();
            if (person instanceof Staff) {
                System.out.println(", salary: " + ((Staff) person).salary() + " ");
            }
        }
    }
}
