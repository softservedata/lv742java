package com.softserve.edu.homework12.task1;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        startApp();
    }

    static void startApp(){
        Calculator calculator = new Calculator();
        View view = new View(calculator);
        Controller controller = new Controller(calculator, view);
        controller.getDivision();
    }
}
