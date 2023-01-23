package com.softserve.edu.hm8;

import java.util.Arrays;

public class App {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student[] array = new Student[4];
        array[0] = new Student("Ivan", "Ivanov", 22, 5);
        array[1] = new Student("Petro", "Petrov", 20, 3);
        array[2] = new Student("Semen", "Semenov", 19, 2);
        array[3] = new Student("Constantin", "Constantinov", 18, 1);

        System.out.println(Arrays.toString(array));

        Student copyObj = (Student) array[2].clone();
        System.out.println("Copy of student #3: " + copyObj);
        copyObj.setFullName(new Student().new FullName("Svitlana", "Svitlanova"));
        copyObj.setAge(88);
        copyObj.setCourse(1);
        System.out.println("Copy of student #3 after changes: " + copyObj);
        System.out.println("Student #3: " + array[2]);
    }
}
