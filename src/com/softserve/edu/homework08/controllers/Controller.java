package com.softserve.edu.homework08.controllers;

import com.softserve.edu.homework08.models.Student;
import com.softserve.edu.homework08.views.View;

public class Controller {
    Student model;
    View view;

    public Controller(Student model, View view) {
        this.model = model;
        this.view = view;
    }

    public void runApp() {
        view.doInput();
        view.getOutput(model.info() + model.activity());
    }
}
