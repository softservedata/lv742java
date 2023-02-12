package com.softserve.edu.homework12.practicaltask.task1;

public class Controller {

    View view;
    Rectangle model;

    public Controller(View view, Rectangle model) {
        this.view = view;
        this.model = model;
    }

    public void getArea(){
        view.doInput();
        view.getOutput("The area is " + model.getArea());
    }
}
