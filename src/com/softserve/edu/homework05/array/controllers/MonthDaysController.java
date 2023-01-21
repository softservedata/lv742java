package com.softserve.edu.homework05.array.controllers;

import com.softserve.edu.homework05.array.utils.AppLauncher;
import com.softserve.edu.homework05.array.models.MonthDaysModel;
import com.softserve.edu.homework05.array.views.View;

public class MonthDaysController {
    MonthDaysModel model;
    View.MonthDaysView view;

    public MonthDaysController(MonthDaysModel model, View.MonthDaysView view) {
        this.model = model;
        this.view = view;
    }

    public void getMonthDays(){
        String output = model.getMessage() +  model.getMonthDays(view.inputDay());
        view.getOutput(output);
        AppLauncher.launchApp();
    }
}
