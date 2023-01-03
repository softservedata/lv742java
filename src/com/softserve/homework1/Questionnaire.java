package com.softserve.homework1;

import java.util.Scanner;

public class Questionnaire {

    private String name;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    static void askQuestions() {
        Scanner scanner = new Scanner(System.in);
        Questionnaire questionnaire = new Questionnaire();
        System.out.println("What is your name?");
        String nameInput = scanner.nextLine();
        questionnaire.setName(nameInput);
        System.out.println("Where do you live, " + questionnaire.getName() + "?");
        String addressInput = scanner.nextLine();
        questionnaire.setAddress(addressInput);
        scanner.close();
    }

    public static void main(String[] args) {
        askQuestions();
    }
}
