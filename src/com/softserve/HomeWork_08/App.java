package com.softserve.HomeWork_08;

public class App {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person ivan = new Student(new Person.Fullname("Ivan", "Ivanov"), 17, 1);
        Person petro = new Student(new Person.Fullname("Petro", "Petrov"), 19, 3);
        System.out.println(ivan.info());
        System.out.println(ivan.activity());
        System.out.println(petro.info());
        System.out.println(petro.activity() + "\n");

        Person ivan1 = (Student) ivan.clone();
        if (ivan1 instanceof Student) {
            ((Student) ivan1).setStudentCourse(4);
        }
        System.out.println(ivan);
        System.out.println(petro);
        System.out.println(ivan1);
    }
}
