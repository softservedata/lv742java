package com.softserve.edu.homework09.controllers;

import com.softserve.edu.homework09.views.ViewApp;
import com.softserve.edu.homework09.models.Calculator;
import com.softserve.edu.homework09.utils.AppStarter;

import java.util.List;

public class CalculatorController {
    List<Integer> list;
    ViewApp view;
    Calculator model;


    public CalculatorController(List<Integer> list, ViewApp view, Calculator model) {
        this.list = list;
        this.view = view;
        this.model = model;
    }

    public void swapMaxMin() {
        view.getOutput("1) " + list);
        model.swapMaxMin(list);
        view.getOutput("2) " + list);
        AppStarter.choose3();
    }

    public void insertRandomValue() {
        view.getOutput("1) " + list);
        model.insertRandomValue(list);
        view.getOutput("2) " + list);
        AppStarter.choose3();
    }

    public void insertZero() {
        view.getOutput("1) " + list);
        model.insertZero(list);
        view.getOutput("2) " + list);
        AppStarter.choose3();
    }

    public void copyFirstElements() {
        view.getOutput("1) " + list);
        List<List> lst = model.copyFirstElements(list, view.getNumber());
        if (lst != null) {
            view.getOutput("2) " + lst);
        } else view.getOutput("Number exceeds the number of elements in the collection! ");
        AppStarter.choose3();
    }

    public void removeEvenElement() {
        view.getOutput("1) " + list);
        model.removeEvenElement(list);
        view.getOutput("2) " + list);
        AppStarter.choose3();
    }

    public void removeNextMin() {
        view.getOutput("1) " + list);
        model.removeNextMin(list);
        view.getOutput("2) " + list);
        AppStarter.choose3();
    }
}
