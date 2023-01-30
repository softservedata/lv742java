package com.softserve.edu.homework08.views;

import com.softserve.edu.homework08.models.Student;
import com.softserve.edu.utils.NumberValidator;

import java.util.Scanner;

public class CloneView {

    Scanner scanner;
    Student model;

    public CloneView(Student model) {
        this.model = model;
    }

    public void changeCourse() {
        scanner = new Scanner(System.in);
        System.out.println("-----------------------------------------");
        System.out.println("Enter the course for the third student: ");

        model.setCourse(NumberValidator.validateIntNumber(scanner));
        scanner.close();
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
