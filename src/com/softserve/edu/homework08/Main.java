package com.softserve.edu.homework08;

public class Main {
    public static void main(String[] args) {
        FullName fullName1 = new FullName("Oleksandr", "Alekhin");
        Student student1 = new Student(fullName1, 20, 2);
        System.out.println("Student1 : " + student1.info());
        System.out.println("Student1 : " + student1.activity());

        FullName fullName2 = new FullName("Yana", "Shevchuk");
        Student student2 = new Student(fullName2, 22, 3);
        System.out.println("Student2 : " + student2.info());
        System.out.println("Student2 : " + student2.activity());








        try {
            Student student3 = (Student) student1.clone();
            student3.setCourse(4);
            System.out.println("Student3 : " + student3.info());
            System.out.println("Student3 : " + student3.activity());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
       //     System.out.println("Error: " + e.getMessage());

        }

    }

}
