package com.softserve.edu.homework08.views;

import com.softserve.edu.homework08.models.Person;
import com.softserve.edu.homework08.models.Student;
import com.softserve.edu.utils.NumberValidator;
import com.softserve.edu.utils.StringValueValidator;

import java.util.Scanner;

public class View {
    Scanner scanner;
    Student model;
    Person.FullName fullName;
    String firstName;
    String lastName;
    int age;
    int course;

    public View(Student model, Person.FullName fullName) {
        this.model = model;
        this.fullName = fullName;
    }

    public void doInput() {
        scanner = new Scanner(System.in);

        System.out.println("-----------------------------------------");

        System.out.println("Enter the student's firstname: ");
        firstName = StringValueValidator.validateValue(scanner);

        System.out.println("Enter the student's lastname: ");
        lastName = StringValueValidator.validateValue(scanner);

        System.out.println("Enter the student's age: ");
        age = NumberValidator.validateIntNumber(scanner);

        System.out.println("Enter the course number the student is taking: ");
        course = NumberValidator.validateIntNumber(scanner);

        fullName.setFirstName(firstName);
        fullName.setLastName(lastName);

        model.setFullName(fullName);
        model.setCourse(course);
        model.setAge(age);
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
