package com.softserve.edu.homework05.array.controllers;

import com.softserve.edu.homework05.array.utils.AppLauncher;
import com.softserve.edu.homework05.array.models.MinElementModel;
import com.softserve.edu.homework05.array.views.View;

public class MinElementController {

    MinElementModel model;
    View view;

    public MinElementController(MinElementModel model, View view) {
        this.model = model;
        this.view = view;
    }

    public void getMinIndex(){
        String output = model.getMessage() + model.getMinArrPosition(view.createArr());
        view.getOutput(output);
        AppLauncher.launchApp();
    }
}
