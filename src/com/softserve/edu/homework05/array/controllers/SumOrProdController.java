package com.softserve.edu.homework05.array.controllers;

import com.softserve.edu.homework05.array.utils.AppLauncher;
import com.softserve.edu.homework05.array.models.SumOrProdModel;
import com.softserve.edu.homework05.array.views.View;

public class SumOrProdController {

    SumOrProdModel model;
    View.SumOrProdView view;

    public SumOrProdController(SumOrProdModel model, View.SumOrProdView view) {
        this.model = model;
        this.view = view;
    }

    public void getSumOrProd(){
        int[] array = view.inputArr();
        String output = model.getMessage() + model.getSumOrProd(array, view.inputNumber(array));
        view.getOutput(output);
        AppLauncher.launchApp();
    }
}
