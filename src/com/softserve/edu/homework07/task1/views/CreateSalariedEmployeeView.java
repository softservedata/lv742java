package com.softserve.edu.homework07.task1.views;

import com.softserve.edu.homework07.task1.models.SalariedEmployee;
import com.softserve.edu.utils.NumberValidator;
import com.softserve.edu.utils.StringValueValidator;

import java.util.Scanner;

public class CreateSalariedEmployeeView {

    SalariedEmployee model;
    String firstName;
    String lastName;
    String socialSecurityNumber;
    double rate;
    double hours;
    String id;

    Scanner scan;

    public CreateSalariedEmployeeView(SalariedEmployee model) {
        this.model = model;
    }

    public void doInput() {
        scan = new Scanner(System.in);

        System.out.print("Enter the employee's firstname: ");
        firstName = StringValueValidator.validateValue(scan);
        model.setFirstName(firstName);

        System.out.print("Enter the employee's lastname: ");
        lastName = StringValueValidator.validateValue(scan);
        model.setLastName(lastName);

        System.out.print("Enter the employee's id: ");
        id = StringValueValidator.validateValue(scan);
        model.setEmployeeId(id);

        System.out.print("Enter the employee's social security number: ");
        socialSecurityNumber = StringValueValidator.validateValue(scan);
        model.setSocialSecurityNumber(socialSecurityNumber);

        System.out.print("Enter the employee's hourly rate: ");
        rate = NumberValidator.validateDoubleNumber(scan);
        model.setRate(rate);

        System.out.print("Enter the number of hours worked: ");
        hours = NumberValidator.validateDoubleNumber(scan);
        model.setHours(hours);
    }

    public void getOutput(String output) {
        System.out.print(output);
    }
}
