package com.softserve.edu.homework07.task1.controllers;

import com.softserve.edu.homework07.task1.models.SalariedEmployee;
import com.softserve.edu.homework07.task1.views.CreateSalariedEmployeeView;

public class CreateSalariedEmployeeController {
    SalariedEmployee model;
    CreateSalariedEmployeeView view;

    public CreateSalariedEmployeeController(SalariedEmployee model, CreateSalariedEmployeeView view) {
        this.model = model;
        this.view = view;
    }

    public void createSalariedEmployee(){
        view.doInput();
    }
}
