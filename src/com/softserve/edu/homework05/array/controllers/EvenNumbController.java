package com.softserve.edu.homework05.array.controllers;

import com.softserve.edu.homework05.array.utils.AppLauncher;
import com.softserve.edu.homework05.array.models.EvenNumbModel;
import com.softserve.edu.homework05.array.views.View;

public class EvenNumbController {

    EvenNumbModel model;
    View view;


    public EvenNumbController(EvenNumbModel model, View view) {
        this.view = view;
        this.model = model;
    }

    public void getEvenNumb(){
        String output = model.getMessage() + model.getProdEvenNumb(view.createArr());
        view.getOutput(output);
        AppLauncher.launchApp();
    }
}
