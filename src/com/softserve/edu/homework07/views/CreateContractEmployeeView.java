package com.softserve.edu.homework07.views;

import com.softserve.edu.homework07.models.ContractEmployee;
import com.softserve.edu.utils.NumberValidator;
import com.softserve.edu.utils.StringValueValidator;

import java.util.Scanner;

public class CreateContractEmployeeView {

    ContractEmployee model;
    String firstName;
    String lastName;
    String federalTaxIdmember;
    double fixMonthlyPayment;
    String id;

    Scanner scan;

    public CreateContractEmployeeView(ContractEmployee model) {
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

        System.out.print("Enter the employee's federal tax id member: ");
        federalTaxIdmember = StringValueValidator.validateValue(scan);
        model.setFederalTaxIdmember(federalTaxIdmember);

        System.out.print("Enter the employee's fixed monthly payment: ");
        fixMonthlyPayment = NumberValidator.validateDoubleNumber(scan);
        model.setFixMonthlyPayment(fixMonthlyPayment);
    }

    public void getOutput(String output) {
        System.out.print(output);
    }
}
