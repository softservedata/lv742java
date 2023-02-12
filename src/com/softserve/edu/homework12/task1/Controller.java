package com.softserve.edu.homework12.task1;

public class Controller {

    Calculator calculator;
    View view;

    public Controller(Calculator calculator, View view) {
        this.calculator = calculator;
        this.view = view;
    }

    public void getDivision(){
        view.doInput();
        view.getOutput("Division is: " + calculator.div(calculator.getA(), calculator.getB()));
    }
}
