package com.softserve.edu.homework08.controllers;

import com.softserve.edu.homework08.models.Student;
import com.softserve.edu.homework08.views.CloneView;
import com.softserve.edu.homework08.views.View;

public class CloneController {
    Student model;
    CloneView view;

    public CloneController(Student model, CloneView view) {
        this.model = model;
        this.view = view;
    }

    public void runApp() {
        view.changeCourse();
        view.getOutput(model.info() + model.activity());
    }
}
