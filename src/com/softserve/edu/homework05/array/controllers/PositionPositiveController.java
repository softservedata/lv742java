package com.softserve.edu.homework05.array.controllers;

import com.softserve.edu.homework05.array.utils.AppLauncher;
import com.softserve.edu.homework05.array.models.PositionPositiveModel;
import com.softserve.edu.homework05.array.views.View;

public class PositionPositiveController {
    PositionPositiveModel model;
    View.PositionPositiveView view;

    public PositionPositiveController(PositionPositiveModel model, View.PositionPositiveView view) {
        this.model = model;
        this.view = view;
    }

    public void getPositionPositive(){
        int[] array = view.inputArr();
        String output = model.getMessage() + model.getPositionPositiveNumb(array, view.inputNumber(array));
        view.getOutput(output);
        AppLauncher.launchApp();
    }
}
